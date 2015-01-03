package com.tom.weather;

public interface Observer {
	public void update(int Temperature, int Humidity, int Pressure);
}
