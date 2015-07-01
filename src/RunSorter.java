
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RunSorter extends JFrame {

	public static void main(String[] args) {
		
        JFrame f = new RunSorter();
        f.setTitle("Sort Text");
        Container contentPane = f.getContentPane();
        contentPane.add( new Sorter());
        f.pack();
        f.setVisible(true);

	}// end main

}// end class
