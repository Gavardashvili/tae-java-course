/**@author Lizi Gavardashvili*/
package Homework5;

public class Fibonacci {
    public static long fib(int n){
        long first = 0;
        long second = 1;

        if (n == 0) return 0;
        if (n == 1) return 1;

        for (int i = 0; i < n-1; i++) {
            long num = first + second;
            first = second;
            second = num;
        }

        return second;
    }
    public static void main(String[] args) {
        int age = 23;
        System.out.println(fib(age));

    }
}
