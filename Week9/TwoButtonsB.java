package Week9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * This class displays a circle, a label, and two buttons
 *  One button causes the circle color to change, and
 *  the other button causes the label to change
 *  Inner classes are used here to catch the two different
 *  button events
 */
public class TwoButtonsB {

    private JFrame frame;
    private JLabel label;

    public static void main (String[] args) {
       TwoButtonsB gui = new TwoButtonsB();
       gui.go();
    }

    public void go() {
       frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // register the Label button listener
       JButton labelButton = new JButton("Change Label");
       labelButton.addActionListener(new LabelButtonListener());

       // register the Color button listener
       JButton colorButton = new JButton("Change Circle");
       colorButton.addActionListener(new ColorButtonListener());

       // create the label
       label = new JLabel("I'm a label");       
       
       // create the drawing panel
       RandomColorDrawPanel drawPanel = new RandomColorDrawPanel();
       
       frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
       frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
       frame.getContentPane().add(BorderLayout.EAST, labelButton);
       frame.getContentPane().add(BorderLayout.WEST, label);

       frame.setSize(420,300);
       frame.setVisible(true);
    }
    
    // this is an inner class
     class LabelButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Ouch!");
        }
     } // close inner class

     // this is an inner class
     class ColorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
     }  // close inner class
   
}



       
      

       