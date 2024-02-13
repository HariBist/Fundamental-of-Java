import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.*;

/**
 * GroupLayout
 */
public class GroupLayoutExample {

    public static void main(String[]args){
        JFrame frame = new JFrame("GroupLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);
        contentPanel.setLayout(groupLayout);
        JLabel clickMe = new JLabel("Click Here");
        JButton b1 = new JButton("Button1");
        // JButton b2 = new JButton("Button1");
        // JButton b3 = new JButton("Button1");
        // JButton b4 = new JButton("Button1");
        groupLayout.setHorizontalGroup(
            groupLayout.createSequentialGroup()
            .addComponent(clickMe, 0, 0, 0)
            .addGap(10,20, 100)
            .addComponent(b1, 0, 0, 0));
groupLayout.setVerticalGroup(
    groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    .addComponent(clickMe, 0, 0, 0)
    .addComponent(b1, 0, 0, 0));
    frame.pack();
    frame.setSize(300,200);
    frame.setVisible(true);

        
    }
}