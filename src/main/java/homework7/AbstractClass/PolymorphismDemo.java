/** @author Lizi Gavardashvili*/
package homework7.AbstractClass;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0]=new Dog("Rex");
        animals[1]=new Dog("Mia");
        animals[2]=new Cat("Buddy");
        animals[3]=new Cat("Zuriko");
        for (Animal a: animals){
            if(a instanceof Dog) {
                System.out.println(((Dog) a).name+ " (Dog) :");
            }else{
                System.out.println(((Cat) a).name + " (Cat) :");
            }
            a.makeSound();
            a.sleep();
        }


    }
}

