package programming3;


	
import java.util.Observable;
import java.util.Observer;
	
/**
 * This class represents weather data that can be updated, perhaps through
 * a feed, or through user input
 * @author based on example in Head First Java
 *
 */
public class WeatherData extends Observable {
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherData() { }
	
	/**
	 * This is called whenever the state is changed
	 * It makes sure observers are notified of the change
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Change the state
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//measurementsChanged();
	}

	
	public double getTemperature() {
		
		return temperature;
	}
	
	public double getHumidity() {
		return humidity;
	}
	
	public double getPressure() {
		return pressure;
	}
}
