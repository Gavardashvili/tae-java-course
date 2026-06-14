/** @author Lizi Gavardashvili*/
package homework8;

public class AgeValidator {
    public static void validate(int age)throws InvalidAgeException{
        if (age < 0 || age > 150){
            throw new InvalidAgeException(age + "(exception)");
        }else {
            System.out.println(age + "(ok)");
        }

    }

    public static void main(String[] args) {
        try{
            AgeValidator.validate(25);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        try{
            AgeValidator.validate(-5);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        try{
            AgeValidator.validate(200);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
