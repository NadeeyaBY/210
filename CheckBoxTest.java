
// CheckBoxTest.java
// Andrew Davison, Jan 2008, ad@fivedots.coe.psu.ac.th

// The JCheckBox GUI in a Java app

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CheckBoxTest extends JFrame 
{

  public CheckBoxTest()
  {
    super("Testing JCheckBox");

    Container c = getContentPane();
    c.setLayout(new FlowLayout());

    // 4 checkboxes
    JCheckBox jck1 = new JCheckBox("Pepperoni");
    JCheckBox jck2 = new JCheckBox("Mushroom");
    JCheckBox jck3 = new JCheckBox("Black olives");
    JCheckBox jck4 = new JCheckBox("Tomato");

    c.add(jck1); c.add(jck2);
    c.add(jck3); c.add(jck4);

    // actionListener for pepperoni box (old style)
    jck1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) 
      { System.out.println("event = " + e); }
    });

    // itemListener for mushroom box (new style)
    jck2.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == e.SELECTED)
          System.out.print("selected ");
        else
          System.out.print("de-selected ");
        System.out.print("Mushroom\n");
      } 
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 100);
    setVisible(true);
  } // end of CheckBoxTest()


  // -------------------------------------------------

  public static void main(String args[])
  { new CheckBoxTest(); } 

} // end of CheckBoxTest class
