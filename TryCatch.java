public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Try Block Begins Here!");
            // int[] myArray = new int[5];
            int[] myArray = { 1, 3, 4, 7, 8 };
            myArray[4] = 9 / 0;
            System.out.println(myArray[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Accessed index out of the array");
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by zero");
         }finally {
            System.out.println("Finally Executed");
        }
    }

}
