package week12.weather;



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
		//instanceof 它的作用是测试它左边的对象是否是它右边的类的实例，返回boolean类型的数据
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
