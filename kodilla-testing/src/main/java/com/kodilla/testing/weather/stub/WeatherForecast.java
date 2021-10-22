package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
            temperatures.getTemperatures().entrySet()) {

            //adding 1 celsius degree to current value
            //as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public Double averageTemperature() {
      double sum = 0.0;
      for (Map.Entry<String, Double> temperature:
          temperatures.getTemperatures().entrySet()) {
          sum += temperature.getValue();
        }
      double avg = sum/ temperatures.getTemperatures().size();
      return avg;
    }


    public Double medianTemperature() {
        double med = 0.0;
        List<Double> temperaturesList = new ArrayList<>();
        for (Map.Entry<String , Double> temperature :
        temperatures.getTemperatures().entrySet()) {
            temperaturesList.add(temperature.getValue());
        }
        Collections.sort(temperaturesList);
        if (temperaturesList.size() % 2 != 0) {
            return temperaturesList.get(temperaturesList.size() / 2);
        } else {
            double a = temperaturesList.get(temperaturesList.size() / 2);
            double b = temperaturesList.get((temperaturesList.size()-1) / 2);
            return (a+b)/2.0;
        }
    }
}
