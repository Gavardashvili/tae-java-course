/** @author Lizi Gavardashvili*/
package homework6;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age , String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public void introduce(){
        System.out.println("გამარჯობა, მე ვარ "+name+", "+age+" წლის.");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Lizi",24,"lgavardashvili@credo.ge");
        Person person2 = new Person("Tamar",32,"tamar@credo.ge");
        System.out.println(person1.getName());
        person1.introduce();
        person2.introduce();
    }
}
