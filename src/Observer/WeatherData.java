package Observer;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {		
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float tem, float hum, float pre) {
		this.temperature = tem;
		this.humidity = hum;
		this.pressure = pre;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return this.temperature;
	}
	
	public float getHumidity() {
		return this.humidity;
	}
	
	public float getPressure() {
		return this.pressure;
	}
}
