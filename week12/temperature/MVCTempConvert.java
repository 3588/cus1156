package week12.temperature;

public class MVCTempConvert 
{	public static void main(String args[]) 
	{	TemperatureModel temperature = new TemperatureModel();
		new FarenheitGUI(temperature, 100, 100);
		new GraphGUI(temperature, 100, 300);
	//	new CelsiusGUI(temperature,100, 250);
	}
}