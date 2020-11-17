package by.htp.les06.airline;


import java.util.Objects;

public class Airline {

    private String destination;
    private Integer tripNumber;
    private String aircraftType;
    private String departureTime;
    private String day;

    public Airline(String destination, String day, String departureTime) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.day = day;

    }

    public Airline() {

    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(Integer tripNumber) {
        this.tripNumber = tripNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return '\n' + "Airline{" +
                "destination='" + destination + '\'' +
                ", tripNumber=" + tripNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime +
                ", day='" + day + '\'' +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(destination, airline.destination) &&
                Objects.equals(tripNumber, airline.tripNumber) &&
                Objects.equals(aircraftType, airline.aircraftType) &&
                Objects.equals(departureTime, airline.departureTime) &&
                Objects.equals(day, airline.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, tripNumber, aircraftType, departureTime, day);
    }
}
