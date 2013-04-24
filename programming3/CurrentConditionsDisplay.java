package programming3;



import java.util.Observable;
import java.util.Observer;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private double temperature;
	private double humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	/**
	 * This is called by notifyObservers
	 * It is part of the Observer interface
	 * The implementation determines what will 
	 * happen when the state of the Observable changes.
	 */
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
