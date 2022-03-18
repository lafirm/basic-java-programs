import javax.swing.*;
public class SwingEx1 {
    JFrame f;
    JButton b;
    SwingEx1(){
        f = new JFrame();
        b = new JButton();
        b.setBounds(270,270,30,30);
        f.add(b);
        f.setTitle("My First Swing App");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new SwingEx1();
    }
}
