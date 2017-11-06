package tasks.cluedo.model;

public class Raum {

    private String bezeichnung;
    private double flaeche;
    private double hoehe;
    private double laenge;
    private double breite;
    private int anzFenster;
    private int anzTueren;

    public Raum(String bezeichnung, double flaeche, double hoehe, double laenge, double breite, int anzFenster, int anzTueren){
        this.bezeichnung=bezeichnung;
        this.flaeche=flaeche;
        this.hoehe=hoehe;
        this.laenge=laenge;
        this.breite=breite;
        this.anzFenster=anzFenster;
        this.anzTueren=anzTueren;
    }

    public void helligkeitEinstellen(int prozent){

    }

    public void temperaturEinstellen(int prozent){

    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getFlaeche() {
        return flaeche;
    }

    public double getHoehe() {
        return hoehe;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    public int getAnzFenster() {
        return anzFenster;
    }

    public int getAnzTueren() {
        return anzTueren;
    }
}
