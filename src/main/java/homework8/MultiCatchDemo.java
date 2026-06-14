/** @author Lizi Gavardashvili*/
package homework8;

public class MultiCatchDemo {
    public static void processInput(String input){
        try{
            int result = Integer.parseInt(input);
            int[] arr = {10,20};
            System.out.println(arr[result] / result);
        }catch (NumberFormatException e){
            System.out.println("NUmberFormatException");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsExeption");
        }catch (ArithmeticException e ) {
            System.out.println("SrithmeticExeption");
        }
    }

    public static void main(String[] args) {
        processInput("abc");
        processInput("0");
        processInput("99");
    }
}