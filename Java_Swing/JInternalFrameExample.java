import java.awt.*;
import javax.swing.*;
public class JInternalFrameExample extends JFrame {
    public JInternalFrameExample(){
JDesktopPane jd = new JDesktopPane();
JInternalFrame jif = new JInternalFrame("JInternalFrame",true,true,true);
JLabel name = new JLabel("Nmae");
JTextField namef = new JTextField(10);
setSize(300,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
add(jd);
jd.add(jif);
jif.setSize(200,200);
jif.setLocation(50,50);
jif.setLayout(new FlowLayout(FlowLayout.CENTER));
jif.add(name);
jif.add(namef);
jif.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new JInternalFrameExample();
    }
    
}
