package com.tts.weatherapp.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tts.weatherapp.domain.Response;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

    public Response getForcast(String zipcode) {
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zipcode + "&units=imperial&appid="
                + apiKey;
        //resttemlplate is used to send the request out to the api 
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Response.class);
    }
}
