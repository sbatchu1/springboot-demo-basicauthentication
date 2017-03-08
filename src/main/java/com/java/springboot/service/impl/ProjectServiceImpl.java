package com.java.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.java.springboot.beans.Weather;
import com.java.springboot.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Override
	public Weather getWeather(String location) {
		Weather weather = new Weather();
		if (location.equals("hyd")) {
			weather.setRainy(true);
			weather.setSunny(false);
			weather.setWindy(false);
		} else if (location.equals("bza")) {
			weather.setRainy(false);
			weather.setSunny(true);
			weather.setWindy(false);
		}
		// TODO Auto-generated method stub
		return weather;
	}

}
