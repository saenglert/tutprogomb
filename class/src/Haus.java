
public class Haus {
    public String dachart = "Spitzdach";
    private int anzahlfenster = 5;
    public int[] grundfläche = new int[2];

    // Getter-Methode die den Wert des private Attributes nach außen reicht
    public int getAnzahlfenster() {
        return anzahlfenster;
    }

    // Setter-Methode die den neuen Wert für anzahlfester entgegennimmt und setzt
    //
    // Hier sieht man ganz gut den Vorteil von privaten Attributen:
    // Bevor man den Wert ändern kann muss er durch eine Methode geleitet werden.
    // Innerhalb dieser Methode kann dann der Wert bevor er im Attribute abgelegt wird
    // überprüft werden und gegebenenfalls geändert werden oder eine Fehlermeldung
    // (Exception) geworfen werden.
    //
    // Im Falle eines Hauses macht eine negative Anzahl von Fenstern wenig Sinn.
    // Daher überprüfe ich ob der Wert den die Funktion übergeben bekommt größer oder
    // gleich 0 ist. Ist das der Fall wird er direkt übernommen. Ist der Wert kleiner
    // als 0, wird stattdessen 0 als neuer Wert für die Anzahl der Fenster gesetzt.
    public void setAnzahlfenster(int anzahlfenster) {
        if(anzahlfenster >= 0) {
            this.anzahlfenster = anzahlfenster;
        } else {
            this.anzahlfenster = 0;
        }
    }
}
