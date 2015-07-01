
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Sorter extends JPanel implements ActionListener {
	
	  private JLabel label1;
	  private JLabel label2;
	  private JTextField field1;
	  private JTextField field2;
	  private JButton SortButton;
	  private JButton CloseButton;
	  
	  public Sorter() {

		    makeTheObjects();
		    doTheLayout();
		    SortButton.addActionListener( new java.awt.event.ActionListener() {
		        public void actionPerformed(ActionEvent e){
		            sort_actionPerformed(e);
		            }
		    });
		    CloseButton.addActionListener( new java.awt.event.ActionListener() {
		        public void actionPerformed(ActionEvent e){
		            close_actionPerformed(e);
		            }
		    });

		  } // end of constructor
	  

	  private void makeTheObjects(){
	      label1 = new JLabel("Enter text here:");
	      label2 = new JLabel("Result will appear here:");
	      field1 = new JTextField("type text", 10);
	      field2 = new JTextField(10);
	      SortButton = new JButton("Sort");
	      CloseButton = new JButton("Close");
	      field2.setEditable(false);

	  }// end of creating objects method

	  private void doTheLayout(){

	      JPanel top = new JPanel();
	      JPanel center = new JPanel();
	      JPanel bottom = new JPanel();

	      top.setLayout( new FlowLayout());
	      top.add(label1);
	      top.add(field1);

	      center.setLayout( new FlowLayout());
	      center.add(label2);
	      center.add(field2);

	      bottom.setLayout( new FlowLayout());
	      bottom.add(SortButton);
	      bottom.add(CloseButton);

	      setLayout( new BorderLayout());
	      add(top, "North");
	      add(center, "Center");
	      add(bottom, "South");

	  }// end of Layout method

	  public void actionPerformed(ActionEvent e){}

	  void sort_actionPerformed(ActionEvent e){
	        String myText = field1.getText();
	        char[] myArray = myText.toCharArray();
	        char temp;
	        String mySort;
	        
	       for ( int i = 0; i < myText.length(); i++ )
	       { 
	    	   //myArray[i] = myText.charAt(i);
	       
	    	   for (int j = 1; j < (myText.length()); j++) 
	    	   { 
	    		   //myArray[j] = myText.charAt(j);
		        
	    		   if (myArray[j-1] > myArray[j]){
	    			   temp = myArray[j];
	    			   myArray[j] = myArray[j-1];
	    			   myArray[j-1] = temp;
	    			   
	    		   }// end if
  
	    	   }// end inner for loop

	       }// end outer for loop
	       
	        mySort = String.valueOf(myArray);	        
	        field2.setText(mySort);
	  }// end of transfer action event method

	  void close_actionPerformed(ActionEvent e){
	      System.exit(0);
	  }// end of transfer action event method

}// end class
