class Test {
    // we are creating this class to use in another program
    // Thats why the class is not public and it wont have main method
    void display() {
        System.out.println("Test Class Display Method result with no arg");
    }

    void display(String msg) {
        System.out.println(msg.toUpperCase());
    }
}
