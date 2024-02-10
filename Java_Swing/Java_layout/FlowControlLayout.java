package Java_Swing.Java_layout;
import java.awt.*;
import javax.swing.*;

public class FlowControlLayout {
    FlowControlLayout(){
        JFrame f = new JFrame("FlowLayout");
        JButton b1,b2,b3,b4;
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b1.setSize(20,30);
        f.add(b4);
        f.add(b3);
        f.add(b2);
        f.add(b1);
        // f.setLayout(new FlowLayout()); //here different type of constructor are in flowLayout
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        f.setSize(300,200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new FlowControlLayout();
    }
    
}
