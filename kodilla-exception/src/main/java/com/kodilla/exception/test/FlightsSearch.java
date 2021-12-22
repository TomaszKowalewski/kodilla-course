package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FlightsSearch {

    public void findFlight (Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Munich", true);

        for (Map.Entry<String, Boolean> entry :airports.entrySet()) {

            if (entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue()) {
                System.out.println("You can arrival to: " + entry.getKey());

            } else if (entry.getKey().equals(flight.getArrivalAirport()) && !entry.getValue()){
                System.out.println("You can not arrival to: " + entry.getKey());

            } else {
                throw new RouteNotFoundException("Airport not found");
            }
        }
    }
}

