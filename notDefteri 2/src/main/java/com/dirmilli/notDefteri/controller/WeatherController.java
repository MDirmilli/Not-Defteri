package com.dirmilli.notDefteri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dirmilli.notDefteri.service.WeatherService;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/description")
    public String getWeatherDescription(@RequestParam String city) {
        return weatherService.getWeatherDescription(city);
    }
    
}
