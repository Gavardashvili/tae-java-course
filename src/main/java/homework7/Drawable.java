/** @author Lizi Gavardashvili*/
package homework7;

public interface Drawable {
    void draw();
}

class Square implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
class Triangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
class Star implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing Star ★");
    }
    public static void main(String[] args) {
        Drawable[] shape = new Drawable[3];
        shape[0]=new Triangle();
        shape[1]=new Square();
        shape[2]=new Star();

        for (Drawable d : shape){
            d.draw();
        }

    }
}



