/** @author Lizi Gavardashvili*/
package homework10;

import java.lang.reflect.Method;

public class AnnotationDemo {
    @Author(name = "Beka")
    public void method1() {
    }
    @Author(name = "Giorgi")
    public void method2() {
    }

    public static void main(String[] args) {
        Method[] methods = AnnotationDemo.class.getDeclaredMethods();

        for (Method method : methods) {
            Author author = method.getAnnotation(Author.class);

            if (author != null) {
                System.out.println(method.getName() + " - " + author.name());

            }
        }
    }
}
