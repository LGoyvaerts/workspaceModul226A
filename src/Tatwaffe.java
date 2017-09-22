public class Tatwaffe {

    private String bezeichnung;
    private String merkmal;
    private double gewicht;
    private double laenge;
    private String material;
    private String farbe;

    public Tatwaffe(String bezeichnung, String merkmal, double gewicht, double laenge, String material, String farbe){
        this.bezeichnung=bezeichnung;
        this.merkmal=merkmal;
        this.gewicht=gewicht;
        this.laenge=laenge;
        this.material=material;
        this.farbe=farbe;
    }

    public void toeten(){

    }

    public void verletzen(int grad){

    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getMerkmal() {
        return merkmal;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getLaenge() {
        return laenge;
    }

    public String getMaterial() {
        return material;
    }

    public String getFarbe() {
        return farbe;
    }
}
