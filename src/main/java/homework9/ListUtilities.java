/** @author Lizi Gavardashvili*/
package homework9;

import java.util.ArrayList;
import java.util.List;

public class ListUtilities {
    public <T> void printList(List <T> list){
        for (T i :list) {
            System.out.println(i);

        }

    }
    public <T> T getFirst(List<T> list){
        return list.get(0);
    }

    public static void main(String[] args) {
        ListUtilities utilities = new ListUtilities();

        List<String> stringList = new ArrayList<>();
        stringList.add("String Box");
        stringList.add("String Box 2");
        utilities.printList(stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(67);
        utilities.printList(integerList);

        System.out.println(utilities.getFirst(stringList));
        System.out.println(utilities.getFirst(integerList));


    }

}
