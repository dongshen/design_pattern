package com.tom.weather;

import java.util.ArrayList;

public class StatisticsDisplay implements DisplayElement, Observer {

	ArrayList temperature = new ArrayList();
	ArrayList humidity = new ArrayList();
	ArrayList pressure = new ArrayList();
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(int Temperature, int Humidity, int Pressure) {
		// TODO Auto-generated method stub
		temperature.add(Temperature);
		humidity.add(Humidity);
		pressure.add(Pressure);
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("StatisticsDisplay");
		System.out.println("avg_Temperature=" + get_avg_Temperature());
		// System.out.println("avg_Humidity=" + current_Humidity);
		// System.out.println("avg_Pressure=" + current_Pressure);
	}

	private int get_avg_Temperature() {
		int avg_Temperature = 0;

		for (int i = 0; i < temperature.size(); i++) {
			avg_Temperature = avg_Temperature + (int) temperature.get(i);
		}

		avg_Temperature = avg_Temperature / temperature.size();

		return avg_Temperature;
	}
}
