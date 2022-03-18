import java.util.InputMismatchException;
import java.util.Scanner;

class InputValidation {
    
    public static void main(String[] args) {  
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        try{
        String name = keyboardInput.next("[A-Za-z]*");
        System.out.println("Your Name is " + name);
        }
        catch (InputMismatchException e){
        System.out.println("Please Enter Valid Text");        
        }
        finally{};
        keyboardInput.close();
    }
}
