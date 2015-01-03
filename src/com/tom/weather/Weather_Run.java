package com.tom.weather;

public class Weather_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData data = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);
		
		
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(data);
		
		
		data.measurementsChanged(10, 10, 10);
		
		data.measurementsChanged(20, 20, 20);
		
	}

}
