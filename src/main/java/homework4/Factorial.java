/** @author <Lizi Gavardashvili> */
package homework4;

public class Factorial {
    public static void main(String[] args) {
        int birthMonth = 8;
        int i = 0;
        long factorial = 1;
        while( i < 8){
            i++;
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
