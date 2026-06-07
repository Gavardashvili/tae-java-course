/** @author <Lizi Gavardashvili> */
package homework4;

public class Calculator {
    public static void main(String[] args) {
        double a = 6;
        double b = 3;
        char op = '/';
        switch (op){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("ნულზე არ იყოფა");
                    break;
                }
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            default:
                System.out.println("უცნობი ოპერატორი");
        }
    }
}
