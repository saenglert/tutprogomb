package raenge;

public class Oberarzt extends aRang {
    public String getAnrede(String vorname, String nachname, boolean geschlecht) {
        if (geschlecht) return "Oberärztin " + vorname + " " + nachname;
        else return "Oberarzt " + vorname + " " + nachname;
    }
}
