import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingEx2 implements ActionListener {
    JFrame f;
    JButton b;

    SwingEx2() {
        f = new JFrame();
        b = new JButton("click");
        b.setBounds(130, 100, 100, 40);
        b.addActionListener(this);

        f.add(b);
        f.setTitle("Swing App with Events");
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closed");
                System.exit(0);
            }

        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        f.getContentPane().setBackground(Color.pink);
        b.setText("Hello");
    }

    public static void main(String[] args) {
        new SwingEx2();
    }
}
