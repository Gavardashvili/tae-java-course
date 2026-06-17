/** @author Lizi Gavardashvili*/
package homework9;

import java.util.ArrayList;

public class NumbersStats {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(83);
        numbers.add(67);
        numbers.add(2);
        numbers.add(48);

        int findMin = numbers.get(0);
        int findMax = numbers.get(0);
        int sum = 0;

        for (int i : numbers) {
            if (i > findMax) {
                findMax = i;

            }
            if (i < findMin) {
                findMin = i;

            }
            sum += i;

        }
        double avg = sum / numbers.size();

        System.out.println(findMax + " " + findMin + " " +avg);

    }

}
