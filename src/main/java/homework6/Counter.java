/** @author Lizi Gavardashvili*/
package homework6;

public class Counter {
    private int count;
    private int maxValue;
    public Counter(){
        this.count=0;
        this.maxValue=100;

    }
    public void increment(){
        if (count <maxValue) {
            count++;
        }
    }
    public void reset(){
        count =0;
    }
    public void countTo(int target){
        for (int i = 1; i <= target; i++) {
            increment();

        }
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        c.countTo(67);
        System.out.println(c.count);

    }
}
