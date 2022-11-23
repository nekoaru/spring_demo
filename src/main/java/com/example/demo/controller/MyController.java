package com.example.demo.controller;

import com.example.demo.model.City;
import com.example.demo.service.ICityService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    private final ICityService cityService;

    public MyController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public List<City> getCities() {

        return cityService.getCities();
    }
        
}