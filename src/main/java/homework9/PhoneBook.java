/** @author Lizi Gavardashvili*/
package homework9;

import java.util.HashMap;

public class PhoneBook {
    static HashMap<String, String> people = new HashMap<>();
    public static String findPhone(String name){
        if (people.containsKey(name)) {
            return people.get(name);

        }else {
            return "არ მოიძებნა";
        }
    }
    public static void main(String[] args) {
        people.put("Lizi", "587392918");
        people.put("Natali", "587392047");
        people.put("Anna", "599691192");
        people.put("Giorgi", "598763544");

        System.out.println(findPhone("Lizi"));
        System.out.println(findPhone("Jora"));

        for (String key : people.keySet()){
            System.out.println(key + " "+ people.get(key));
        }


    }
}
