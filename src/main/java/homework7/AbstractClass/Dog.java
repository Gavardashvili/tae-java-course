/** @author Lizi Gavardashvili*/
package homework7.AbstractClass;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.makeSound();
        d.sleep();

    }
}
