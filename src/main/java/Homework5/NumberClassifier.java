/**@author Lizi Gavardashvili*/
package Homework5;

public class NumberClassifier {
    public static String classify(int n){
        if (n > 0) {
            return "Positive";
        } else if (n < 0) {
            return "Negative";
        }else{
            return "Zero";
        }
    }

    public static String classify(double n){
        if (n > 0) {
            if (n % 1 != 0) {
            return "Positive - Decimal";
            }else {
            return "Positive - Whole Double";
            }
        } else if (n < 0) {
            if (n % 1 != 0) {
            return "Negative - Decimal";
            }else {
            return "Negative - Whole Double";
        }
        }else{
            return "Zero";
        }


    }
    public static void main(String[] args) {
        int num = -7;
        double number = 8.36;
        System.out.println(classify(num));
        System.out.println(classify(number));

    }
}
