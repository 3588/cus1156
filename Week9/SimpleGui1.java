package Week9;
import javax.swing.*;

public class SimpleGui1
	{

	
		public static void main(String[] args)
			{
			// make a frame
			JFrame frame = new JFrame();
			
			// make a widget
			JButton button = new JButton("click me");
			
		    // this makes the program quit as soon as you close the window
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// add the widget to the frame
			frame.add(button);
			
			// display
            frame.setSize(300,300);
            frame.setVisible(true);
			}

	}
