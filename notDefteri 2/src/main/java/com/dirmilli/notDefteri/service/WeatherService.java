package com.dirmilli.notDefteri.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.dirmilli.notDefteri.helper.WeatherHelper;

@Service
public class WeatherService {

    // @Value("${weather.api.key}")
    // private  String weatherApiKey="bcc85ce852aa4e008a4153939242612";

    private final String BASE_URL = "http://api.weatherapi.com/v1/current.json?key=bcc85ce852aa4e008a4153939242612&q={city}&lang=tr";

    public String getWeatherDescription(String city) {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> params = new HashMap<>();
        params.put("city", city);

        // Fetch weather data and map it to the Weather class
        WeatherHelper weather = restTemplate.getForObject(BASE_URL, WeatherHelper.class, params);

        // Extract and return the description
        if (weather != null && weather.getCurrent() != null && weather.getCurrent().getCondition() != null) {
            String description = weather.getCurrent().getCondition().getText();
            System.out.println(description);
            return description;
        } else {
            throw new RuntimeException("Failed to retrieve weather description");
        }
    }
}
    
    
        

