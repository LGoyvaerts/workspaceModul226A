package tasks.cluedo;

import tasks.cluedo.model.Person;
import tasks.cluedo.model.Raum;
import tasks.cluedo.model.Tatwaffe;

import java.util.Random;
import java.util.Scanner;

public class CluedoGame {

    Person michel = new Person("Elias", "Herr", "lange Haare", 16, 1.85, "Jude", "Informatiker");
    Person dorian = new Person("Ljuta", "Herr", "kurze Haare", 16, 1.80, "macht gerne Witze", "Hausmeister");
    Person joel = new Person("Sahli", "Herr", "Cap", 19, 1.85, "bevorzugt NBA dem Essen", "Arbeitslos");
    Person yamil = new Person("Sigrist", "Alien", "kurze Haare", 16, 2.30, "stellt sich kompliziertere Fragen als A. Einstein", "Swisscom-Ma.");
    Person selina = new Person("Urwank", "Frau", "lange  Haare", 20, 1.60, "liebt Cosplay", "Informatikerin");
    Person lehrer = new Person("Rutschmann", "Lehrer", "kurze Haare", 50, 1.70, "spielt chancenlos LOL mit seinem Sohn", "Lehrer");

    Tatwaffe messer = new Tatwaffe("Messer", "scharfe Klinge", 200, 15, "Metall", "silber");
    Tatwaffe pistole = new Tatwaffe("Pistole", "Glock-18", 2400, 18, "Metall", "schwarz");
    Tatwaffe katana = new Tatwaffe("Katana", "japanisches Originalwerk", 1500, 60, "Schmiede-Metall", "silber");
    Tatwaffe stift = new Tatwaffe("Stift", "Swarovski Spezialanfertigung", 100, 10, "Metall + geschliffenes Glas", "glänzend grau");
    Tatwaffe sturmgewehr = new Tatwaffe("Sturmgewehr", "AR-15", 8000, 50, "Metall", "schwarz");
    Tatwaffe bowlingkugel = new Tatwaffe("Bowlingkugel", "mitgegangen beim letzten Mal", 5000, 20, "Holz + Verschalung", "grün");

    Raum kueche = new Raum("Küche", 25, 2.50, 5, 5, 2, 1);
    Raum wohnzimmer = new Raum("Wohnzimmer", 50, 2.50, 10, 5, 4, 2);
    Raum lounge = new Raum("Lounge", 12, 2.50, 4, 3, 3, 1);
    Raum korridor = new Raum("Korridor", 25, 2.90, 10, 2.5, 0, 0);
    Raum ballsaal = new Raum("Ballsaal", 200, 4.50, 20, 10, 12, 2);
    Raum musikzimmer = new Raum("Musikzimmer", 120, 2.50, 12, 10, 6, 1);
    Raum ruhezimmer = new Raum("Ruhezimmer", 30, 2.50, 6, 5, 4, 2);
    Raum computerzimmer = new Raum("Computerzimmer", 150, 3.20, 15, 10, 6, 1);


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int guesses = 5;

        CluedoGame cluedoGame = new CluedoGame();
        Random random = new Random();
        int personStelle = random.nextInt(6);
        int tatwaffeStelle = random.nextInt(6);
        int raumStelle = random.nextInt(8);
        Person[] personen = cluedoGame.personen();
        Tatwaffe[] tatwaffen = cluedoGame.tatwaffen();
        Raum[] raume = cluedoGame.raume();

        System.out.println("Krimi Cluedo\n");

        int pCounter = 0;
        int tCounter = 0;
        int rCounter = 0;


        for (Person p : personen) {
            System.out.println(pCounter + ": " + p.getAnrede() + " " + p.getName() + ", " + p.getKopfverzierung() + ", " + p.getAlter() + " Jahre alt, " + p.getGroesse() + "m, " + p.getMerkmal() + ", " + p.getBeruf());
            pCounter++;
        }
        System.out.println("");

        for (Tatwaffe t : tatwaffen) {
            System.out.println(tCounter + ": " + t.getBezeichnung() + ", " + t.getMerkmal() + ", " + t.getGewicht() + "g, " + t.getLaenge() + "cm " + t.getMaterial() + ", " + t.getFarbe());
            tCounter++;
        }
        System.out.println("");

        for (Raum r : raume) {
            System.out.println(rCounter + ": " + r.getBezeichnung() + ", Masse: " + r.getLaenge() + "*" + r.getBreite() + " = " + r.getFlaeche() + ", " + r.getHoehe() + "m hoch, " + r.getAnzFenster() + " Fenster, " + r.getAnzTueren() + " Türen");
            rCounter++;
        }

        while (true) {

            int rightOnes = 0;

            System.out.print("\nIhre Eingabe: ");
            String[] guess = in.nextLine().split("\\s+");

            try {


                Integer one = Integer.parseInt(guess[0]);
                Integer two = Integer.parseInt(guess[1]);
                Integer three = Integer.parseInt(guess[2]);

                if (CluedoGame.inRange(one, 6) && CluedoGame.inRange(two, 6) && CluedoGame.inRange(three, 8)) {

                    if (one == personStelle) {
                        rightOnes++;
                    }

                    if (two == tatwaffeStelle) {
                        rightOnes++;
                    }

                    if (three == raumStelle) {
                        rightOnes++;
                    }

                    if (rightOnes == 3) {
                        System.out.println("\nGewonnen!");
                        System.exit(0);
                    }

                    System.out.println("\nRichtig: " + rightOnes);

                    guesses--;

                    if (guesses == 0) {
                        System.out.println("\nVerloren");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Falsche Eingabe!");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nBuchstaben eingegeben!");
            } finally {
                in.close();
            }

        }


    }

    private static Boolean inRange(Integer input, int range) {

        return input >= 1 && input <= range;

    }

    private Person[] personen() {

        Person[] temp = new Person[6];
        temp[0] = michel;
        temp[1] = dorian;
        temp[2] = joel;
        temp[3] = yamil;
        temp[4] = selina;
        temp[5] = lehrer;

        return temp;
    }

    private Tatwaffe[] tatwaffen() {

        Tatwaffe[] temp = new Tatwaffe[6];

        temp[0] = messer;
        temp[1] = pistole;
        temp[2] = katana;
        temp[3] = stift;
        temp[4] = sturmgewehr;
        temp[5] = bowlingkugel;

        return temp;
    }

    private Raum[] raume() {

        Raum[] temp = new Raum[8];

        temp[0] = kueche;
        temp[1] = wohnzimmer;
        temp[2] = lounge;
        temp[3] = korridor;
        temp[4] = ballsaal;
        temp[5] = musikzimmer;
        temp[6] = ruhezimmer;
        temp[7] = computerzimmer;

        return temp;
    }

}
