package tasks.hotel;

public class Ortschaft {

    String name;
    int postleitzahl;

    private Ortschaft() {
    }

    Ortschaft(String name, int postleitzahl) {
        this.name = name;
        this.postleitzahl = postleitzahl;
    }

    public Ortschaft(Ortschaft ortschaft){
        name=ortschaft.name;
        postleitzahl=ortschaft.postleitzahl;
    }
}
