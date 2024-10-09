package com.example.demo.service;

public class WeatherApiResponse {
    private Request request;
    private Location location;
    private Current current;

    // Getters e Setters
    public Request getRequest() { return request; }
    public void setRequest(Request request) { this.request = request; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public Current getCurrent() { return current; }
    public void setCurrent(Current current) { this.current = current; }

    // Classes internas
    public static class Request {
        private String type;
        private String query;

        // Getters e Setters
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public String getQuery() { return query; }
        public void setQuery(String query) { this.query = query; }
    }

    public static class Location {
        private String name;
        private String country;

        // Getters e Setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getCountry() { return country; }
        public void setCountry(String country) { this.country = country; }
    }

    public static class Current {
        private String observation_time;
        private double temperature;

        // Getters e Setters
        public String getObservationTime() { return observation_time; }
        public void setObservationTime(String observation_time) { this.observation_time = observation_time; }

        public double getTemperature() { return temperature; }
        public void setTemperature(double temperature) { this.temperature = temperature; }
    }
}