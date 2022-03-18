public class MethodOverLoading {
    void sampleMethod(){
        System.out.println("This is output of sampleMethod with void return type.");
    }
    String sampleMethod(String message){
        return message;
    }
    //we overloaded same method different return type and different arg, called method overloading
    // condition is that method should have same or different return type, but with different arguments (must)
    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.sampleMethod(); //invoking method with void type
        System.out.println(obj.sampleMethod("This is output of sampleMethod with String return type.")); //invoking method with String type
        obj.sampleMethod("3rd try"); // this line returns 3rd try, but you have to use sout to display in output
    }
}
