package homework8;

public class InputValidator {
    public static int processAge(String input) throws NumberFormatException,IllegalArgumentException{

        int age = Integer.parseInt(input);
        if (age<0){
            throw new IllegalArgumentException("Illegal Argument");

        }
        return age*12;
    }

    public static void main(String[] args) {
        try{
            System.out.println(InputValidator.processAge("34"));

        }catch (NumberFormatException e){
            System.out.println("არასწორი რიცხვი");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
