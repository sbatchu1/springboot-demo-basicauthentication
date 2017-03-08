package com.java.springboot.service;

import com.java.springboot.beans.Weather;

public interface ProjectService {
	
	public Weather getWeather(String location);

}
