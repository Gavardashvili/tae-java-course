/** @author <Lizi Gavardashvili> */
package homework4;

public class PrimeCheck {
    public static void main(String[] args) {
        int age = 23;
        boolean isPrime = true;
        for (int i = 2; i < age/2 ; i++) {
            if (age % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(age + "->" + isPrime);
    }
}
