package by.htp.les06.airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineList {
    private List<Airline> airlineList;

    public AirlineList() {
        airlineList = new ArrayList<>();

    }

    public void add(Airline airline) {
        this.airlineList.add(airline);
    }

    public List<Airline> getAirlineList() {
        return airlineList;
    }

    public void setAirlineList(List<Airline> airlineList) {
        this.airlineList = airlineList;
    }

    @Override
    public String toString() {
        return "AirlineList{" +
                "airlineList=" + airlineList +
                '}';
    }
}
