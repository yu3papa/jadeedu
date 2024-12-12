package com.jadecross.weather;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TemperatureController {
	
	@CrossOrigin
	@GetMapping("/")
	public @ResponseBody CurrentTemperature currentTemperature() {
		//
		return new CurrentTemperature();
	}

}
