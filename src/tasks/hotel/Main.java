package tasks.hotel;

public class Main {

    public static void main(String[] args) {

        Ortschaft zurich = new Ortschaft("Zürich", 8000);
        Hotel marionaud = new Hotel("Marionaud", zurich, 200);
        Hotelzimmer marionaudEins = new Hotelzimmer(21, 2, marionaud);

        Hotelzimmer marionaudZwei = new Hotelzimmer(marionaudEins);
        System.out.println(marionaudEins.nummer);
        System.out.println(marionaudZwei.nummer);
    }
}
