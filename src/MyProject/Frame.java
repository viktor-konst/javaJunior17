package MyProject;

import javax.swing.*;
import java.awt.*;

public class Frame
{
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame =new Okno();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Игра");

        });
    }
}
class Okno extends JFrame {
    public Okno(){
        add(new OknoComponent());
        pack();
    }
}
class OknoComponent extends JComponent{
    public static final int MessageX =75;
    public static final  int MessageY= 100;
    public static final int Width =75;
    public static final  int Height= 100;
    public void paintComponent(Graphics g){
        g.drawString("Какая-то чушь",MessageX,MessageY);
    }
    public Dimension getPrefferedSize(){
        return new Dimension(Width,Height);
    }
}
