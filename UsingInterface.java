class Document implements PrintAny {
    public void print() {
        System.out.println("Magic is here!");
    }
}

public class UsingInterface {
    public static void main(String[] args) {
        Document myDoc;
        myDoc = new Document();
        myDoc.print();
    }

}
