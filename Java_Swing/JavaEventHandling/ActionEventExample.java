import java.awt.event.*;
import javax.swing.*;
public class ActionEventExample extends JFrame implements ActionListener {
    JTextField tf,tf1,tf2;
    ActionEventExample(){
JButton bt = new JButton("click here");
tf = new JTextField();
tf.setBounds(60,50,170,20);
bt.setBounds(60,90,130,20);
bt.addActionListener(this);
add(bt);
add(tf);
setSize(300,300);
setLayout(null);
setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("hello World!");
    }
    public static void main(String[] args) {
        new ActionEventExample();
    }

}
