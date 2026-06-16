/** @author Lizi Gavardashvili*/
package homework9;

import java.util.ArrayList;

public class NamesList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lizi");
        names.add("Teona");
        names.add("Giorgi");
        names.add("Anna");
        names.add("Zaza");

        System.out.println("Size : "+ names.size());
        System.out.println("First : "+ names.get(0));
        System.out.println("Last : "+ names.get(4));

        names.remove(2);

        System.out.println("Contains Anna? "+ names.contains("Anna"));

        for(String name : names){
            System.out.println(name);
        }
    }
}
