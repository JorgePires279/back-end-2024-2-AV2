package com.example.demo.controller;

import com.example.demo.service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public Object getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }

    @PostMapping
    public String postWeather(@RequestBody model.WeatherRequest request) {
        // Aqui você pode processar os dados recebidos
        return "Recebido: " + request.getCidade(); // Deve ser uma String
    }

    @GetMapping("/ajuda")
    public String ajuda() {
        return "\"Nome\": \"Jorge Luiz Madeira Pires\", \"Projeto\": \"Serviço de Meteorologia: \"WeatherWise\"";
    }
}