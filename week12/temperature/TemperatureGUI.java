package week12.temperature;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



abstract class TemperatureGUI implements java.util.Observer

{	
	private String label;
	private TemperatureModel model;
	private Frame temperatureFrame;
	private TextField display = new TextField();
	private Button upButton = new Button("Raise");
	private Button downButton = new Button("Lower");
	
	TemperatureGUI(String label, TemperatureModel model, int h, int v)
	{	this.label = label;
		this.model = model;
		temperatureFrame = new Frame(label);
		temperatureFrame.add("North", new Label(label));
		temperatureFrame.add("Center", display);
		Panel buttons = new Panel();
		buttons.add(upButton);
		buttons.add(downButton);		
		temperatureFrame.add("South", buttons);		
		temperatureFrame.addWindowListener(new CloseListener());	
		model.addObserver(this); // Connect the View to the Model
		
		temperatureFrame.pack();
		temperatureFrame.setLocation(h, v);
		temperatureFrame.setVisible(true);
	}
	
	public void setDisplay(String s){ display.setText(s);}
	
	public double getDisplay()
	{	double result = 0.0;
		try
		{	result = Double.valueOf(display.getText()).doubleValue();
		}
		catch (NumberFormatException e){}
		return result;
	}
	
	public void addDisplayListener(ActionListener a){ display.addActionListener(a);}
	public void addUpListener(ActionListener a){ upButton.addActionListener(a);}
	public void addDownListener(ActionListener a){ downButton.addActionListener(a);}
	
	protected TemperatureModel model(){return model;}
	
	
	
	public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
}