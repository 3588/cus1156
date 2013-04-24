package programming3;



import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private double currentPressure = 29.92f;  
	private double lastPressure;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	/**
	 * This is called by notifyObservers
	 * It is part of the Observer interface
	 * The implementation determines what will 
	 * happen when the state of the Observable changes.
	 */
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
