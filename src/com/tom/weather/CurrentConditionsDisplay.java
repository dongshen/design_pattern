package com.tom.weather;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private int current_Temperature;
	private int current_Humidity;
	private int current_Pressure;
	private WeatherData weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CurrentConditionsDisplay");
		System.out.println("current_Temperature=" + current_Temperature);
		System.out.println("current_Humidity=" + current_Humidity);
		System.out.println("current_Pressure=" + current_Pressure);
	}

	@Override
	public void update(int Temperature, int Humidity, int Pressure) {
		// TODO Auto-generated method stub
		current_Temperature = Temperature;
		current_Humidity = Humidity;
		current_Pressure = Pressure;
		display();
	}

}
