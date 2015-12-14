package raenge;

public class Facharzt extends aRang {
    public String getAnrede(String vorname, String nachname, boolean geschlecht) {
        if (geschlecht) return "Fachärztin " + vorname + " " + nachname;
        else return "Facharzt " + vorname + " " + nachname;
    }
}
