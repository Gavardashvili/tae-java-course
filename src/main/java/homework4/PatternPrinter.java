/** @author <Lizi Gavardashvili> */
package homework4;

public class PatternPrinter {
    public static void main(String[] args) {
        String name = "Lizi";
        for (int i = 1; i <= (name.length()); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
