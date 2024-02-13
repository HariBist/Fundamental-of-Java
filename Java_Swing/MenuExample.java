import javax.swing.*;
import java.awt.*;
public class MenuExample {
    JMenu Menu , SubMenu;
    JMenuItem i,i2,i3,i5,i6;
     MenuExample(){
        JFrame frame = new JFrame("Jmenu Example");
        Menu = new JMenu("Menu");
        Menu.setBounds(12,14,20,20);
        SubMenu = new JMenu("Course");
        JMenuBar mb = new JMenuBar();
        i = new JMenuItem("Home");
        i2 = new JMenuItem("About");
        i3 = new JMenuItem("Contact us");
        i5 = new JMenuItem("Bit");
        i6 = new JMenuItem("BscCsit");
        Menu.add(i);
        Menu.add(i2);
        Menu.add(i3);
       SubMenu.add(i5);
       SubMenu.add(i6);
       Menu.add(SubMenu);
       mb.add(Menu);
       frame.setJMenuBar(mb);
       frame.setSize(400,400);
       frame.setLayout(null);
       frame.setVisible(true);

    }
    public static void main(String[] args) {
        new MenuExample();
    }
    
}
