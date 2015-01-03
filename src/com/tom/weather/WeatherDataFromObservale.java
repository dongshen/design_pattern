package com.tom.weather;

import java.util.Observable;

public class WeatherDataFromObservale extends Observable {
	private int current_Temperature;
	
	public int getCurrent_Temperature() {
		return current_Temperature;
	}
	public void setCurrent_Temperature(int current_Temperature) {
		this.current_Temperature = current_Temperature;
	}
	public int getCurrent_Humidity() {
		return current_Humidity;
	}
	public void setCurrent_Humidity(int current_Humidity) {
		this.current_Humidity = current_Humidity;
	}
	public int getCurrent_Pressure() {
		return current_Pressure;
	}
	public void setCurrent_Pressure(int current_Pressure) {
		this.current_Pressure = current_Pressure;
	}
	private int current_Humidity;
	private int current_Pressure;
	
}
