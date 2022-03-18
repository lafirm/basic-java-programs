import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Paint extends Frame implements MouseMotionListener {
    Label l;
    Color c = Color.blue;
    
    Paint() {        
        l = new Label();
        l.setBackground(Color.yellow);
        l.setBounds(20, 40, 100, 20);
        add(l);

        addMouseMotionListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);     

    }

    public void mouseDragged(MouseEvent e) {
        l.setText("X=" + e.getX() + ", Y=" + e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.black);
        g.fillOval(e.getX(), e.getY(), 10, 10);
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("X=" + e.getX() + ", Y=" + e.getY());
    }

    public static void main(String[] args) {
        new Paint();
    }

}
