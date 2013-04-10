package Week9;
import javax.swing.*;

import java.awt.event.*;

public class SimpleGui1B implements ActionListener
	{
        private JButton button;
        
		public void go()
			{
				// make a frame
				JFrame frame = new JFrame();
				
				// make a widget
				button = new JButton("click me");
				
				// register with the button
				button.addActionListener(this);
				
			    // this makes the program quit as soon as you close the window
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				// add the widget to the frame
				frame.getContentPane().add(button);
				
				// display
	            frame.setSize(300,300);
	            frame.setVisible(true);
			}

		public void actionPerformed(ActionEvent event)
			{
				button.setText("I've been clicked");
			}
	}
