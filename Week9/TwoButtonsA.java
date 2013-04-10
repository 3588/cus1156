package Week9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 *  This class displays a circle, a label, and two buttons
 *  One button causes the circle color to change, and
 *  the other button causes the label to change
 *  This shows a simple way to distinguish between two
 *  events, which doesn't scale up well
 */
public class TwoButtonsA implements ActionListener
	{

	    private JFrame frame;
	    private JLabel label;
	    private JButton colorButton;
	    private JButton labelButton;
	    
		public static void main(String[] args)
			{
				 TwoButtonsA gui = new TwoButtonsA();
			       gui.go();
			}
		
		public void go() {
			       frame = new JFrame();
			       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			        labelButton = new JButton("Change Label");
			       labelButton.addActionListener(this);

			       colorButton = new JButton("Change Circle");
			       colorButton.addActionListener(this);

			       label = new JLabel("I'm a label");       
			       RandomColorDrawPanel drawPanel = new RandomColorDrawPanel();
			       
			       frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
			       frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
			       frame.getContentPane().add(BorderLayout.EAST, labelButton);
			       frame.getContentPane().add(BorderLayout.WEST, label);

			       frame.setSize(420,300);
			       frame.setVisible(true);
			    }

		// this is a simple way to distinguish between two
		// events but it doesn't scale well
		public void actionPerformed(ActionEvent event)
			{
				if (event.getSource() == colorButton)
		        {
		        	System.err.println("color button pushed");
		        
		        	frame.repaint();
		        }
		        else
		        {
		        	System.err.println("label button pushed");
		       
		        	label.setText("That hurt!");
		        }
				
			}
		

	}
