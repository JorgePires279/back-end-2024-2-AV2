package com.example.demo.service;

import com.example.demo.model.WeatherResponse; // classe que você deve criar
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getWeather(String city) {
        String apiKey = "a6b0f9bc54fcb73c2769792a66a41219";
        String url = String.format("http://api.weatherstack.com/current?access_key=%s&query=%s", apiKey, city);

        WeatherApiResponse apiResponse = restTemplate.getForObject(url, WeatherApiResponse.class);

        // Criar e retornar a resposta no formato desejado
        WeatherResponse response = new WeatherResponse();
        response.setName(apiResponse.getLocation().getName());
        response.setCountry(apiResponse.getLocation().getCountry());
        response.setTemperature(apiResponse.getCurrent().getTemperature());

        return response;
    }
}