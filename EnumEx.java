enum Level {
    low, medium, high
}
// enum is a datatype used to store multiple value of variables
// enum is a kind of class, which can be declared before the main class itself

public class EnumEx {
    public static void main(String[] args) {
        System.out.println("Your Level Keyword - medium");
        Level myVar = Level.medium;
         //create an object from enum class and initialize with any value
        
        switch(myVar){
            case low:
            System.out.println("Low Level");
            break;
            case medium:
            System.out.println("Medium Level");
            break;
            case high:
            System.out.println("High Level");
            break;
        }
    }
    
}
