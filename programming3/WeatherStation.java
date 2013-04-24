package programming3;

/**
 * This class creates the weather data object, sets some of its values, and starts the
 * various user interfaces
 * @author based on example in HeadFirst Design Patterns
 *
 */
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
	//	CurrentConditionsGUI ccGUI = new CurrentConditionsGUI(weatherData, 100,100);
	//	ForecastGUI fcGUI = new ForecastGUI(weatherData, 100, 100);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
		/*GUI test @ junjun*/
		init();
	}
	/*GUI test @ junjun*/
	static void init()
	{
		WeatherDataGUI t = new WeatherDataGUI();
	}
}
