/** @author Lizi Gavardashvili*/
package homework10;

import java.util.List;
import java.util.stream.Collectors;

public class MapStream {

    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Beka", "Cita");

        List<String> upper = names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        List<Integer> lengths = names.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(upper);
        System.out.println(lengths);
    }
}