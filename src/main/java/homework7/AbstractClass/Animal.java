/** @author Lizi Gavardashvili*/
package homework7.AbstractClass;

abstract class Animal {
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void makeSound();
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
