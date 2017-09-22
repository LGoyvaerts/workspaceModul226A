import java.awt.*;
import java.util.Date;

public class Person {

    private String name;
    private String anrede;
    private String kopfverzierung;
    private Integer alter;
    private Double groesse;
    private String merkmal;
    private String beruf;

    private Person(){

    }

    public Person(String name, String anrede, String kopfverzierung, Integer alter, Double groesse, String merkmal, String beruf){
        this.name=name;
        this.anrede=anrede;
        this.kopfverzierung=kopfverzierung;
        this.alter=alter;
        this.groesse=groesse;
        this.merkmal=merkmal;
        this.beruf=beruf;
    }

    public String getName() {
        return name;
    }

    public String getAnrede() {
        return anrede;
    }

    public String getKopfverzierung() {
        return kopfverzierung;
    }

    public Integer getAlter() {
        return alter;
    }

    public Double getGroesse() {
        return groesse;
    }

    public String getMerkmal() {
        return merkmal;
    }

    public String getBeruf() {
        return beruf;
    }
}
