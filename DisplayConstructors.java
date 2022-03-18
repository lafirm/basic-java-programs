//This is an example of Overloading (same method name with different arguments, here we use constructors)
class DisplayConstructors{
    DisplayConstructors()
    {
        System.out.println("Hello!");
    }

    DisplayConstructors(String msg) //we shouldnt mention return type for constructors, its an error
    {
        int len = msg.length();
        System.out.println(len);
    }

    DisplayConstructors(String msg1, String msg2){
        String result = "not compared yet";
        if (msg1.equalsIgnoreCase(msg2)){
            result = "Both content are same";
        }
        else{
            result = "Both content are not same";
        }
        System.out.println(result);
        
    }
    void doNothing(){

    }

    public static void main(String[] args) {
        DisplayConstructors obj = new DisplayConstructors(); // we are creating a new object, so that it will invoke the method, since thats a constructor
        DisplayConstructors obj1 = new DisplayConstructors("apple"); 
        DisplayConstructors obj2 = new DisplayConstructors("apple", "APPLe");
        obj.doNothing(); // just to utilise the objects initiated
        obj1.doNothing();
        obj2.doNothing();
        
    }
    
}
