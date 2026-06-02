/**@author Lizi Gavardashvili*/
package Homework5;

public class VowelCounter {
    public static int countVowels(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'a':
                    counter++;
                    break;
                case 'e':
                    counter++;
                    break;
                case 'i':
                    counter++;
                    break;
                case 'o':
                    counter++;
                    break;
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        String name ="LiZI";
        String lowerCase = name.toLowerCase();
        System.out.println(countVowels(lowerCase));


    }
}
