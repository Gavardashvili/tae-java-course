/** @author Lizi Gavardashvili*/
package homework7;

public class PartTime extends Employee{
    protected double hourlyRate;
    protected int hourWorked;
    public PartTime(String name, double hourlyRate, int hourWorked){
        super(name);
        this.hourlyRate=hourlyRate;
        this.hourWorked=hourWorked;
    }

    @Override
    public double calculateSalary() {
        return hourWorked*hourlyRate;
    }

    public static void main(String[] args) {
        Employee[] team = {
                new FullTime("Anna", 5000),
                new PartTime("Beka", 25, 80) };
        for (Employee e : team) {
            e.printInfo();
            System.out.println(e.calculateSalary());
        }
    }
}
