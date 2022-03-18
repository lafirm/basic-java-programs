import java.util.Scanner;

class Grade {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Plesae enter your name:");
        String name = keyboardInput.next();
        System.out.println("Plesae enter your mark:");
        float mark = keyboardInput.nextFloat();
        char grade = 'E';
        if ((mark > 90) && (mark <= 100))
            grade = 'S';
        else if ((mark > 80) && (mark <= 90))
            grade = 'A';
        else if ((mark > 70) && (mark <= 80))
            grade = 'B';
        else if ((mark > 60) && (mark <= 70))
            grade = 'C';
        else if ((mark > 50) && (mark <= 60))
            grade = 'D';
        else if ((mark > 44) && (mark <= 50))
            grade = 'E';
        else if ((mark >= 0) && (mark <= 44))
            grade = 'F';
        else
            System.out.println("Please enter valid mark (0 - 100)");

        System.out.println("");
        System.out.println("*Score Card*");
        System.out.println("Name: " + name);
        System.out.println("Mark Scored: " + mark);
        System.out.println("Grade: " + grade);

        keyboardInput.close();
    }
}
