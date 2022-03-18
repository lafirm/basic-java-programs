import java.util.InputMismatchException;
import java.util.Scanner;

class Purchase {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println(
                "Enter the details of your purchase, maximum 3 items allowed and the total price should not exceed SGD 100.");
        String itemName, allItem = " ";
        int price = 0;
        int total = 0;
        int count = 0;
        try {
            for (count = 0; count < 3 && total < 100; count++) {
                System.out.println("Enter Item Name");
                itemName = keyboardInput.next("[A-Za-z]*");
                System.out.println("Enter Item Price");
                price = keyboardInput.nextInt();
                total += price;
                allItem = allItem + "-" + itemName;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please Enter Valid Data (Don't include Space or Special Characters in Item Name)");
        } finally {
        }

        if (total > 0 && total <= 100) {
            if (total == 100) {
                System.out.println("Limit Reached!");
            } else if (total < 100) {
                System.out.println("Limit Not Reached! Your Balance is:  SGD " + (100 - total));                
            }
            System.out.println("Purchase approved!");
            System.out.println("You Purcahsed:  " + count + " item(s)");
            System.out.println("");
            System.out.println("Item(s) are:" + allItem);
            System.out.println("Total price of the purchase is:  SGD " + total);
        } else if (total > 100) {
            System.out.println("Purchase exceeded 100SGD - not approved");
        }

        keyboardInput.close();

    }
}
