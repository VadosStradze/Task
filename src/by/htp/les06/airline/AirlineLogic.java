package by.htp.les06.airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {

    public List<Airline> findByTime(AirlineList list, String day, String time) {
        List<Airline> airline;
        List<Airline> air = new ArrayList<>();
        airline = list.getAirlineList();
        for (Airline r : airline) {
            double trans = Double.parseDouble(r.getDepartureTime().replace(':', '.'));
            double parameter = Double.parseDouble(time.replace(':', '.'));
            if (r.getDay().equals(day) && trans >= parameter) {
                air.add(r);
            }
        }
        return air;
    }

    public List<Airline> findByDay(AirlineList list, String day) {
        List<Airline> findDay;
        List<Airline> finder = new ArrayList<>();
        findDay = list.getAirlineList();
        for (Airline find : findDay) {
            if (find.getDay().equals(day)) {
                finder.add(find);
            }
        }
        return finder;

    }

    public List<Airline> findByDestination(AirlineList list, String place) {
        List<Airline> findPlace;
        List<Airline> finder = new ArrayList<>();
        findPlace = list.getAirlineList();
        for (Airline find : findPlace) {
            if (find.getDestination().equals(place)) {
                finder.add(find);
            }
        }
        return finder;
    }


}
