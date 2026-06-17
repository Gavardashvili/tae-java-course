/** @author Lizi Gavardashvili*/
package homework9;
class Box<T>{
    private T value;

    public void set(T value) {
        this.value = value;
    }
    public T get(){
        return value;
    }


}
public class GenericBox {


    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println( "String Box : "+ stringBox.get());

        Box<Integer> intbox = new Box<>();
        intbox.set(42);
        System.out.println( "INteger Box : "+ intbox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println( "String Box : "+ doubleBox.get());

    }
}
