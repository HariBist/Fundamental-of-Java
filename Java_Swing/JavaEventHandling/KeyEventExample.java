package JavaEventHandling;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyEventExample extends JFrame{
    JTextField tf1,tf2;
    KeyEventExample(){
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(tf1);
        add(tf2);
        tf2.setEditable(false);
        tf1.addKeyListener( new KeyListener(){
            public void keyTyped(KeyEvent e){}
            public void keyPressed(KeyEvent e){}
            public void keyReleased(KeyEvent e){
                String copy = tf1.getText();
                tf2.setText(copy);
            }
        });
    }
    public static void main(String[] args) {
        new KeyEventExample();
    }
    
}
