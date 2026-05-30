/** @author <Lizi Gavardashvili> */
package homework4;

public class GradeCalculator {
    public static void main(String[] args) {
        int birthMonth = 8;
        if (birthMonth <= 2) {
            System.out.println("F");
        } else if (birthMonth <= 5) {
            System.out.println("D");
        } else if (birthMonth <= 8) {
            System.out.println("C");
        } else if (birthMonth < 12) {
            System.out.println("B");
        } else if (birthMonth == 12) {
            System.out.println("A");
        } else {
            System.out.println("უცნობი ოპერატორი");
        }
    }
}
