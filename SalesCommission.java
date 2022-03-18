import java.util.Scanner;

class SalesCommission {
    
    public static void main(String[] args) {
        double commissionPct = 0;        
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Please Enter Your Sales value: ");
        double sales = keyboardInput.nextDouble();
        if (sales < 5000) {
            commissionPct = 0.05;
        } else if ((sales >= 5000) && (sales <= 10000)) {
            commissionPct = 0.1;
        } else if (sales > 10000) {
            commissionPct = 0.2;
        } else {
            System.out.println("Kindly Enter Valid Amount");
        }
        keyboardInput.close();
        double commissionValue = sales * commissionPct;
        System.out.println("*********************************");
        System.out.println("Sales Value: " + sales);
        System.out.println("Commission Percentage: " + commissionPct*100 + "%");
        System.out.println("Commission Value: " + commissionValue );
    }
}
