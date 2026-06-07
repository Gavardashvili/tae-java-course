/** @author Lizi Gavardashvili*/
package homework6;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;

    }
    @Override
    public double area(){
        return width*height;

    }

    public static void main(String[] args) {
        System.out.println(new Rectangle(4,5).area());
    }

}
