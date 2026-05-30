/** @author <Lizi Gavardashvili> */


package homework4;

public class FizzBuzz {
    public static void main(String[] args) {
        int age = 23;
        for (int i = 1; i <= (age *3); i++) {
            if (i % 5==0 & i % 3 ==0) {
                System.out.println("FizzBuzz");
                continue;
            }else if (i % 3 == 0 ) {
                System.out.println("Fizz");
                continue;
            }else if(i % 5 ==0){
                System.out.println("Buzz");
                continue;
            }else {
                System.out.println(i);
            }


        }

    }
}
