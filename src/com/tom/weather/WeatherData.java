package com.tom.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observer_list = new ArrayList<Observer>();

	private int current_Temperature;
	private int current_Humidity;
	private int current_Pressure;

	public WeatherData() {

	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observer_list.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int index = observer_list.indexOf(observer);
		if (index > 0) {
			observer_list.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observer_list.size(); i++) {
			Observer observer = observer_list.get(i);
			observer.update(current_Temperature, current_Humidity,
					current_Pressure);
		}

	}

	public int getTemperature() {
		return current_Temperature;
	}

	public int getHumidity() {
		return current_Humidity;
	}

	public int getPressure() {
		return current_Pressure;
	}

	public void measurementsChanged(int Temperature, int Humidity, int Pressure) {
		current_Temperature = Temperature;
		current_Humidity = Humidity;
		current_Pressure = Pressure;
		notifyObservers();
	}
}
