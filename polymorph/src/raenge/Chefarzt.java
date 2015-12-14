package raenge;

public class Chefarzt extends aRang {
    public String getAnrede(String vorname, String nachname, boolean geschlecht) {
        if (geschlecht) return "Chefärztin " + vorname + " " + nachname;
        else return "Chefarzt " + vorname + " " + nachname;
    }
}
