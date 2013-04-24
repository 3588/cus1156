package week12.temperature;

/**
 * This represents one temperature
 * @author Joseph Bergin
 *
 */
public class TemperatureModel extends java.util.Observable
{	
	private double temperatureF = 32.0;
	public double getFahrenheit(){return temperatureF;}
	
	public double getCelsius(){return (temperatureF - 32.0) * 5.0 / 9.0;}
	
	public void setFahrenheit(double tempF)
	{	temperatureF = tempF;
		setChanged();
		notifyObservers();
	}
	
	public void setCelsius(double tempC)
	{	temperatureF = tempC*9.0/5.0 + 32.0;
		setChanged();
		notifyObservers();
	}

	
}