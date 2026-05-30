/** @author <Lizi Gavardashvili> */
package homework4;

public class EvenOddCounter {
    public static void main(String[] args) {
        int birthYear = 2002;
        int counterEven = 0;
        int counterOdd = 0;
        for (int i = 1; i <= birthYear % 100; i++) {
            if (i % 2 ==0) {
                counterEven++;
            }else{
                counterOdd++;
            }

        }
        System.out.println("ლუწი ციფრების რაოდენობა - "+ counterEven);
        System.out.println("კენტი ციფრების რაოდენობა - " +counterOdd);

    }
}
