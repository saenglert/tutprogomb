public class Polymorph {
    public static void main(String[] args) {
        Arzt no1 = new Arzt("Hans", "von Fallersleben", false, 3);
        Arzt no2 = new Arzt("Hedwig", "Schlessman", true, 2);
        Arzt no3 = new Arzt("Dieter", "Stadter", false, 1);
        Arzt no4 = new Arzt("Chantal", "Müller", true, 0);

        System.out.println(no1.anrede());
        System.out.println(no2.anrede());
        System.out.println(no3.anrede());
        System.out.println(no4.anrede());
    }
}
