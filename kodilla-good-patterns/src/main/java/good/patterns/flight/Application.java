package good.patterns.flight;

import java.util.List;

public class Application {

    public static void main(String [] args) {

        FlightService flightService = new FlightService();
        List<Flight> flightFrom = flightService.findFlyFrom("WAW");
        System.out.println("Flight from :" + flightFrom);

        List<Flight> flightTo = flightService.findFlyTo("WAW");
        System.out.println("Flight to :" + flightTo);


    }
}
