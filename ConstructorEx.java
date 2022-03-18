public class ConstructorEx {
    ConstructorEx() {
        System.out.println("Default Constructor");
    }

    ConstructorEx(int i) {
        System.out.println("Constructor with an argument, this is called Parameterised constructor");
    }
    //we shouldnt mention return type for constructors
    void doNothing(){

    }

    public static void main(String[] args) {
        ConstructorEx obj = new ConstructorEx(); // we are creating a new object, so that it will invoke the method
        ConstructorEx obj1 = new ConstructorEx(7); // since thats a constructor
        obj.doNothing();
        obj1.doNothing();
    }
}
