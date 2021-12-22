package com.kodilla.exception.test;

public class Flights {

    public static void main(String[] args) {
        Flights flights = new Flights();

        Flight flight = new Flight("Sydney", "Munich");
        FlightsSearch flightsSearch = new FlightsSearch();

        try {
            flightsSearch.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("The airport is not finding");
        }
    }
}
