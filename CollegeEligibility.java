import java.util.Scanner;

class CollegeEligibility {   

    public void findEligibility(int age){
        if (age>=18 && age<=25)
        {
        System.out.println("true");
        }
        else
        {
            System.out.println("false");
            }
    }
    
    public static void main(String[] args) {  
        Scanner keyboardInput = new Scanner(System.in);
        CollegeEligibility test = new CollegeEligibility();
        System.out.println("Enter the age: ");
        int age = keyboardInput.nextInt();
        test.findEligibility(age);
        keyboardInput.close();
    }
}

