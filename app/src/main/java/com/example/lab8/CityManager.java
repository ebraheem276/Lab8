package com.example.lab8;

import java.util.ArrayList;

public class CityManager {
    private ArrayList<String> cities;

    public CityManager() {
        cities = new ArrayList<>();
    }

    public void addCity(String city) {
        cities.add(city);
    }
}