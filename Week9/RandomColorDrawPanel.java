package Week9;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;


public class RandomColorDrawPanel extends JPanel
	{
        public void paintComponent(Graphics g)
        	{
        		// fill the entire panel with black (the default color)
        		// first two args are the upper left corner, where
        		// drawing starts
        		// the third and fourth args are the width and height
        		g.fillRect(0,0, this.getWidth(), this.getHeight());
        		
        		// generate the color, in terms of RGB
        		int red = (int) (Math.random() * 255);
        		int green = (int) (Math.random() * 255);
        		int blue = (int) (Math.random() * 255);
        		
        		Color randomColor = new Color(red, green, blue);
        		g.setColor(randomColor);
        		// start 70 pixels from the left, 70 from the top
        		// and make it 100 pixels wide and 100 pixels tall
        		g.fillOval(70, 70, 100, 100);
                
        	}
	}
