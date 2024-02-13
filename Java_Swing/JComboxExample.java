
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
public class JComboxExample {
    String user[]={"Aman","Sagar","Amit"};
    public JComboxExample (){
        JFrame frame = new JFrame();
        JComboBox jc= new JComboBox<>(user);
        frame.add(jc);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
    public static void main(String[]args)
    {
        new JComboxExample();
    }
    
}
