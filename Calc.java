import java.util.Scanner;

public class Calc {
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtract(int a, int b) {
        int result = (a>b) ? (a - b) : (b-a) ;
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static void main(String[] args) {
        Calc obj = new Calc();
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = keyboardInput.nextInt();
        int b = keyboardInput.nextInt();
        System.out.println("You entered: " + a + "  &  " + b);
        System.out.println("Enter your choice:");
        System.out.println("1. Addition  2. Subtraction  3. Multiplication");
        int choice = keyboardInput.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The Addition of 2 numbers is " + obj.add(a, b));
                break;
            case 2:
                System.out.println("The Subtraction of 2 numbers is " + obj.subtract(a, b));
                break;
            case 3:
                System.out.println("The Multiplication of 2 numbers is " + obj.multiply(a, b));
                break;
            default:
                System.out.println("Please enter a valid choice");
                break;
        }

        keyboardInput.close();
    }
}
