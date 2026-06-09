/**@author Lizi Gavardashvili*/
package Homework5;

public class DigitCounter {
    public static int countDigits(int n){
        n = Math.abs(n);
        int count = 0;
        while(n != 0){
            n = n /10;
            count++;

        }
        return count;

    }
    public static void main(String[] args) {
        int birthYear = 2002;
        System.out.println(countDigits(birthYear));

    }
}
