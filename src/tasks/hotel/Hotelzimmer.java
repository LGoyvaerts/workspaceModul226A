package tasks.hotel;

public class Hotelzimmer {

    Integer nummer;
    int stockwerk;
    Hotel hotel;

    private Hotelzimmer() {
    }

    public Hotelzimmer(Integer nummer, int stockwerk, Hotel hotel) {
        this.nummer = nummer;
        this.stockwerk = stockwerk;
        this.hotel = hotel;
    }

    public Hotelzimmer(Hotelzimmer hotelzimmer) {
        this.nummer = new Integer(hotelzimmer.nummer);
        this.stockwerk = new Integer(hotelzimmer.stockwerk);
        this.hotel = new Hotel(hotelzimmer.hotel);
    }
}
