/** @author Lizi Gavardashvili*/
package homework7;
 abstract class Employee {
    protected String name;
    public Employee(String name){
        this.name=name;

    }
    public abstract double calculateSalary();
    public void printInfo(){
        System.out.println(name);
    }
}
