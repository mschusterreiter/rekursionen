
import javax.swing.*;
import java.awt.*;

public class SierpinskiTriangle extends JPanel {
    private static final int MAX_DEPTH = 2;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSierpinski(g, MAX_DEPTH, getWidth() / 2, 0, 0, getHeight(), getWidth(), getHeight());
    }

    //Mit g.drawLine(int a, int b, int c, int d) können Sie eine einfache Linie von Punkt (a,b) zu Punkt (c,d) zeichnen.
    private void drawSierpinski(Graphics g, int depth, int x1, int y1, int x2, int y2, int x3, int y3) {
        //TODO: Hier könnte Ihre Lösung stehen.
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sierpinski Triangle");
        SierpinskiTriangle triangle = new SierpinskiTriangle();
        frame.add(triangle);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}
