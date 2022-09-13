
// ComboBoxTest.java
// Andrew Davison, Nov 2008, ad@fivedots.coe.psu.ac.th
// Using a JComboBox to select an image to display.


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ComboBoxTest extends JFrame
{
  private JComboBox images;
  private JLabel label;
  private String names[] = { "bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif" };
  private Icon icons[];


  public ComboBoxTest()
  {
    super("Testing JComboBox");

    icons = new Icon[names.length];
    for(int i=0; i < names.length; i++)
      icons[i] = new ImageIcon(names[i]);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());      

    images = new JComboBox(names);
    images.setMaximumRowCount(3);
    c.add(images);

    label = new JLabel(icons[0]);
    c.add(label);

    images.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e)
      { label.setIcon(icons[ images.getSelectedIndex() ]); }
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(350, 100);
    setVisible(true);
  }  // end of ComboBoxTest()


  // -------------------------------------------------------------

  public static void main(String args[])
  { new ComboBoxTest();  }

}  // end of ComboBoxTest class

