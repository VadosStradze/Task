package by.htp.les06.airline;

public class Test {
    public static void main(String[] args) {
        AirlineList list = new AirlineList();
        AirlineLogic logic = new AirlineLogic();
        Airline airline = new Airline("Minsk", "Sunday", "10:28");
        Airline airline1 = new Airline("Brest", "Monday", "19:22");
        Airline airline2 = new Airline("Moscow", "Monday", "23:50");
        Airline airline3 = new Airline("Moscow", "Tuesday", "01:22");

        list.add(airline);
        list.add(airline1);
        list.add(airline2);
        list.add(airline3);

        System.out.println(list);
        System.out.println("//1");
        System.out.println(logic.findByDestination(list, "Brest"));
        System.out.println("//2");
        System.out.println(logic.findByDay(list, "Sunday"));
        System.out.println("//3");
        System.out.println(logic.findByTime(list, "Monday", "00:00"));

    }
}
