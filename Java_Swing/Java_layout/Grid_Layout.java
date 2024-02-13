import java.awt.GridLayout;
//Grid layout organize the components in a two dimensional grid.
//it simply create equal-sized components and arranges them in the desired number of rows and columns.

import javax.swing.*;

public class Grid_Layout {
    Grid_Layout(){
        JFrame f = new JFrame();
        JButton b1,b2,b3,b4;
        b1=new JButton("A");
        b2=new JButton("B");
        b3=new JButton("C");
        b4=new JButton("D");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
         //GridLayout Constructors are:
        f.setLayout(new GridLayout()); //it creates a grid layout with one column per component in a row.
       f.setLayout(new GridLayout(2,2)); //it creates a gridlayout with the 2*2 row and column but now gaps
       f.setLayout(new GridLayout(2,2,20,20)); //it work same as above but also define
        f.setSize(200,200);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new Grid_Layout();
    }
}
