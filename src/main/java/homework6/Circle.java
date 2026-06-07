/** @author Lizi Gavardashvili*/
package homework6;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);

    }

    public static void main(String[] args) {
        System.out.println(new Circle(3).area());
    }
}
