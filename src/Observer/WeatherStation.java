package Observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
				weatherData);
		weatherData.setMeasurements(1f, 2f, 3f);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		weatherData.setMeasurements(2f, 3f, 4f);
	}
}
