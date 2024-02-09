package Java_Swing.Java_layout;
import java.awt.BorderLayout;
import javax.swing.*;
public class borderLayout {
    borderLayout(){
        JFrame f = new JFrame();
        JButton b1, b2,b3,b4,b5;
        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("West");
        b4 = new JButton("East");
        b5 = new JButton("Center");
        f.setLayout(new BorderLayout());
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.EAST);
        f.add(b5,BorderLayout.CENTER);
        f.setSize(600,600);
        f.setVisible(true);

    }
    public static void main(String[]args)
    {
        new borderLayout();
    }

    
}
