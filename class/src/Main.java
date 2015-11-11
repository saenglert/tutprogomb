
public class Main {
    public static void main(String[] args) {
        Haus nummer1 = new Haus();
        Haus nummer2 = new Haus();
        Haus nummer3 = new Haus();

        // Ausgabe der Werte der public Attribute die in der Klasse festgelegt wurden
        System.out.println("Dach #1 " + nummer1.dachart);
        System.out.println("Dach #2 " + nummer2.dachart);
        System.out.println("Dach #3 " + nummer3.dachart);

        // Ändern der Werte der public Attribute
        nummer1.dachart = "Doofes Dach";
        nummer2.dachart = "Eiscreme";

        // Ausgabe der neuen Werte
        System.out.println("Dächer geändert");
        System.out.println("Dach #1 " + nummer1.dachart);
        System.out.println("Dach #2 " + nummer2.dachart);
        System.out.println("Dach #3 " + nummer3.dachart);

        // Funktioniert nicht, da das Attribute private ist

        //nummer1.anzahlfenster = -1;
        //nummer2.anzahlfester = 0;
        //nummer3.anzahlfenster = 1;

        //System.out.println("Fenster #1 " + nummer1.anzahlfenster );
        //System.out.println("Fenster #2 " + nummer2.anzahlfenster );
        //System.out.println("Fenster #3 " + nummer3.anzahlfenster );

        // Ausgabe der (geänderten) Werte der private Attribute über die getter-Methode
        System.out.println("Fenster #1 " + nummer1.getAnzahlfenster());
        System.out.println("Fenster #2 " + nummer2.getAnzahlfenster());
        System.out.println("Fenster #3 " + nummer3.getAnzahlfenster());

        // Ändern der private Attribute über die setter-Methode
        nummer1.setAnzahlfenster(-1);
        nummer2.setAnzahlfenster(0);
        nummer3.setAnzahlfenster(1);

        // Ausgabe der (geänderten) Werte der private Attribute über die getter-Methode
        System.out.println("Fenster geändert");
        System.out.println("Fenster #1 " + nummer1.getAnzahlfenster());
        System.out.println("Fenster #2 " + nummer2.getAnzahlfenster());
        System.out.println("Fenster #3 " + nummer3.getAnzahlfenster());


    } // end method
} // end class
