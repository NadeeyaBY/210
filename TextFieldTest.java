
// TextFieldTest.java
// Andrew Davison, Jan 2008, ad@fivedots.coe.psu.ac.th

// The JTextField GUI in a Java app

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TextFieldTest extends JFrame 
{
   private JTextField jtf;   // global since used in actionPerformed()

   public TextFieldTest()
   {
      super( "Testing JTextField" );

      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      // label and text entry field
      JLabel jl = new JLabel("Enter your name:");
	  jtf  = new JTextField(25);   // 25 chars wide
      c.add(jl);
	  c.add(jtf);

      // Handle events from entering text (pressing return)
	  jtf.addActionListener( new ActionListener() {
		  public void actionPerformed(ActionEvent e)
		  {  System.out.println("You entered " +  e.getActionCommand() );
			 jtf.setText("");
		  }
      });

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 100);
      setVisible(true);
   } // end of TextFieldTest()


  // --------------------------------------------------

   public static void main( String args[] )
   {  new TextFieldTest();  } 

} // end of TextFieldTest class
