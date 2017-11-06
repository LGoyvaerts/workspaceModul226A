package tasks.hotel;

public class Hotel {

    String bezeichnung;
    Ortschaft ort;
    int anzahlGaeste;

    private Hotel(){
    }

    public Hotel(String bezeichnung, Ortschaft ort, int anzahlGaeste){
        this.bezeichnung=bezeichnung;
        this.ort=ort;
        this.anzahlGaeste=anzahlGaeste;
    }

    public Hotel(Hotel hotel){
        this.bezeichnung=hotel.bezeichnung;
        this.ort=hotel.ort;
        this.anzahlGaeste=hotel.anzahlGaeste;
    }
}
