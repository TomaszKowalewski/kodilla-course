package good.patterns.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private List<Flight> flightList = List.of(
            new Flight("KRK", "WAW"),
            new Flight("NY", "LON"),
            new Flight("SYD","KRU"),
            new Flight("WAW", "GDA"),
            new Flight("WAW", "NY")
    );
    public List<Flight> findFlyFrom(String departure) {
        return flightList.stream()
                .filter(flight -> departure.equals(flight.getDeparture()))
                .collect(Collectors.toList());
    }
    public List<Flight> findFlyTo(String arrival) {
        return  flightList.stream()
                .filter(flight -> arrival.equals(flight.getArrival()))
                .collect(Collectors.toList());
    }
    public List<List<Flight>> findFlyBetween (String departure, String arrival) {
        List<Flight> flightFrom = findFlyFrom(departure);
        List<Flight> flightTo = findFlyTo(arrival);

        List<List<Flight>> flights = new ArrayList<>();
        flightFrom.stream()
                .filter(flight -> flightTo.contains(new Flight(flight.getArrival(), arrival)))
                .forEach(flight -> flights.add(List.of(flight, new Flight(flight.getArrival(), arrival))));
                return flights;
    }

}
