package raenge;

public class Rang {
    public static final Rang instance = new Rang();
    private aRang[] raenge = new aRang[4];

    private Rang() {
        raenge[0] = new AIP();
        raenge[1] = new Facharzt();
        raenge[2] = new Oberarzt();
        raenge[3] = new Chefarzt();
    }

    public String get(String vorname, String nachname, boolean geschlecht, int rang) {
        return raenge[rang].getAnrede(vorname, nachname, geschlecht);
    }

    public static Rang getInstance() {
        return instance;
    }
}
