package com.java.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.beans.Weather;
import com.java.springboot.service.ProjectService;

@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	ProjectService service;

	@RequestMapping(value = "/{location}/get-weather", method = RequestMethod.GET)
	public ResponseEntity<Weather> getWeather(@PathVariable String location) {
		// verify the access token and proceed
		return new ResponseEntity<Weather>(service.getWeather(location), HttpStatus.OK);
	}
}
