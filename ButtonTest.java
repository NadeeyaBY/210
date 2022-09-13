
// ButtonTest.java
// Andrew Davison, Jan 2008, ad@fivedots.coe.psu.ac.th

// The JButton GUI in a Java app

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ButtonTest extends JFrame 
{
   private int pressCount = 1;

   public ButtonTest()
   {
      super( "Testing JButton" );

      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      // JButton constructor with a string argument
      JButton jb = new JButton( "Press me" );
      c.add( jb );

      // Handle events from pressing the button
	  jb.addActionListener( new ActionListener() {
		  public void actionPerformed(ActionEvent e)
		  {  System.out.println("Pressed " + pressCount++ ); }
      });

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  pack();
      setVisible(true);
   } // end of ButtonTest()


  // ----------------------------------------------------------


   public static void main( String args[] )
   {  new ButtonTest(); } 

} // end of ButtonTest class
