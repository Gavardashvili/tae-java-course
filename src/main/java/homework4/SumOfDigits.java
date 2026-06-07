/** @author <Lizi Gavardashvili> */
package homework4;


public class SumOfDigits {
    public static void main(String[] args) {
        int birthYear = 2001;
        int sum = 0;
        while(birthYear != 0){
            sum += birthYear % 10;
            birthYear = birthYear /10;
        }
        System.out.println(sum);

    }
}
