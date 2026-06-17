/** @author Lizi Gavardashvili*/
package homework9;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "java git java oop java git python";
        HashMap<String, Integer> map = new HashMap<>();

        String[] split = sentence.split(" ");
        for (String i : split) {
            int count = 0;
            if (map.containsKey(i)) {
                count = map.get(i) + 1;

            }else {
                count = 1;
            }
            map.put(i,count);

        }
        System.out.println(map);


    }
}
