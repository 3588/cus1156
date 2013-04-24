package programming3;

import java.awt.*;
import java.awt.event.*;

import javax.swing.Box;

/**
 * The Class WeatherDataGUI.
 * @author junjun
 */
abstract class WeatherDataGUI implements java.util.Observer

{	
	
	/** The weatherdata frame. */
	private Frame weatherDataFrame;
	
	/** The Label. */
	private Label currentConditions = new Label("Current Conditions");
	private Label temperature = new Label("Temperature");
	private Label pressure = new Label("Pressure");
	private Label humidity = new Label("Humidity");
	private Label winds  = new Label("Winds");
	
	/** The TextField. */
	private TextField inputTemperature = new TextField(5);
	private TextField inputPressure = new TextField(5);
	private TextField inputHumidity = new TextField(5);
	private TextField inputWinds = new TextField(5);
	
	/** The Subimt button. */
	private Button subimt = new Button("Subimt");
	
	/**
	 * Instantiates a new weather data gui.
	 */
	WeatherDataGUI()
	{
		weatherDataFrame = new Frame("Weather Data GUI");
		weatherDataFrame.add("North",currentConditions);
		
		Box centerBox = Box.createVerticalBox();
		Panel panelTemperature = new Panel();
		Panel panelPressure = new Panel();
		Panel panelHumidity = new Panel();
		Panel panelWinds = new Panel();
		panelTemperature.add(temperature);
		panelTemperature.add(inputTemperature);
		panelPressure.add(pressure);
		panelPressure.add(inputPressure);
		panelHumidity.add(humidity);
		panelHumidity.add(inputHumidity);
		panelWinds.add(winds);
		panelWinds.add(inputWinds);
		centerBox.add(panelTemperature);
		centerBox.add(panelPressure);
		centerBox.add(panelHumidity);
		centerBox.add(panelWinds);
		
		
		weatherDataFrame.add("Center",centerBox);
		weatherDataFrame.add("South", subimt);
		weatherDataFrame.addWindowListener(new CloseListener());
		weatherDataFrame.pack();
		weatherDataFrame.setVisible(true);
		//pending(1) which file we want to put
		addSubimtListener(new subimtListener());
	}
	
	public void addSubimtListener(ActionListener a){subimt.addActionListener(a);}
	
	public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
	
	//pending(1) which file we want to put
	class subimtListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	
		System.out.print("inputTemperature:"+inputTemperature.getText()+"\n");
		System.out.print("inputPressure:"+inputPressure.getText()+"\n");
		System.out.print("inputHumidity:"+inputHumidity.getText()+"\n");
		System.out.print("inputWinds:"+inputWinds.getText()+"\n");
		}
	}
}
