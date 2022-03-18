import MyPackage.*;
import MyPackage.Math;
public class UsePackage {
    public static void main(String[] args) {
        Tokyo obj = new Tokyo(); //creating an object from a class in Rome Package
        obj.printMyName();
        obj.printMyAge();
        System.out.println(obj.display("This sentence is capitalized"));
        Math test = new Math();
        test.calc(3,4);
    }
    
}
