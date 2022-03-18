class reverseString {
    public void ReverseStringUsingStringBuilder(String word) { // method to reverse a string using StringBuilder
        StringBuilder buildWord = new StringBuilder();
        
        buildWord.append(word); // append a string into StringBuilder buildWord        
        buildWord.reverse(); // reverse StringBuilder
        System.out.println("Original Word: " + word);        
        System.out.println("Reversed Word: " + buildWord); // print reversed String
    }

    public void ReverseStringUsingForLoop(String word) { // method to reverse a string using for loop
        String reverseWord = "";
        char letter;

        System.out.print("Original word: ");
        System.out.println(word);

        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i); // to extract each letter from the word
            reverseWord = letter + reverseWord; // to add each letter at the front of reverse word
        }
        System.out.println("Reversed word: " + reverseWord); // print reversed String
    }
}

public class WordReversal {

    public static void main(String[] args) {
        reverseString obj = new reverseString();
        System.out.println("Reversed Word using String Builder");
        obj.ReverseStringUsingStringBuilder("London");
        System.out.println("");
        System.out.println("*********************************");
        System.out.println("");
        System.out.println("Reversed Word using For Loop");
        obj.ReverseStringUsingForLoop("Madras");
    }

}
