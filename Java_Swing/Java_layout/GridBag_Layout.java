//GridBag Layout is a flexible layout manager that aligns component vertically and horizontally,
//requiring that the components be of the same size. It maintains a dynamic rectangular grid cells with each
//component occupying one or more cells.
import java.awt.*;
import javax.swing.*;
public class GridBag_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBag Layout Example");
        JButton b1 = new JButton("Button1");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b2 = new JButton("Button2");
        JButton b5 = new JButton("Button5");
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cst = new GridBagConstraints();
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridwidth=1;
        cst.gridy =0;
        panel.add(b1,cst);
        //add button 2 on the panel
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 1;
        cst.gridy =0;
        panel.add(b2,cst);
        //add button 3 on the panel
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy =2;
        panel.add(b3,cst);
        //button 3
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 2;
        cst.gridy =0;
        panel.add(b3,cst);
        //button 4
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 3;
        cst.gridy =2;
        panel.add(b4,cst);
        //button 5
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy =0;
        cst.gridheight =2;
        cst.gridwidth = 3;
        panel.add(b5,cst);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
