import raenge.Rang;

public class Arzt {
    String vorname;
    String nachname;
    boolean geschlecht;
    int rang;

    Arzt(String vorname, String nachname, boolean geschlecht, int rang) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
        this.rang = rang;
    }

    public String anrede() {
        return Rang.getInstance().get(this.vorname, this.nachname, this.geschlecht, this.rang);
    }
}
