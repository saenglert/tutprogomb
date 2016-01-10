package aufgabe3;

public class Aufgabe3 {

    /* Aufgabe 3
    Gegeben sei die Klasse Koordinate. Arrays von Koordinaten sollen verwendet werden um Streckenzüge zu beschreiben.
    In der folgenden Abbildung ist ein Streckenzug mit fünf Punkten [p0,p1,p2,p3,p4] dargestellt. Dabei sind p0, p1,
    p2, p3 und p4 Instanzen der Klasse Koordinate und [p0,p1,p2,p3,p4] ein Array von Koordinaten
     */

    public static void main(String[] args) {

    }

    /* A)
    Man unterscheidet geschlossene von offenen Streckenzügen. Bei einem geschlossenen Streckenzug stimmen Anfangs und
    Endpunkt überein, bei einem offenen Streckenzug nicht. Schreiben Sie eine Methode die zu einem Streckenzug bestimmt,
    ob der Streckenzug geschlossen ist oder nicht.
     */


    public static boolean istStreckeGeschlossen(Koordinate[] strecke) throws Exception {
        if (strecke.length < 2) throw new Exception("Das ist keine Strecke");
        else return strecke[0] == strecke[strecke.length - 1];
    }

    /* B)
    Schreiben Sie eine Methode, die zu einem Streckenzug dessen Gesamtlänge bestimmt.

    Hinweise:
    -> Die Streckenlänge zwischen zwei Punkten (x1,y1) und (x2,y2) ist
        Math.sqrt(Math.pow(x1 - x2 , 2) + Math.pow(y1 - y2, 2));
     */

    public static double laenge(Koordinate[] strecke) throws Exception {
        if (strecke.length < 2) throw new Exception("Das ist keine Strecke");
        else {
            double laenge = 0;
            for (int i = 0; i < strecke.length - 1; i++) {
                laenge += Math.sqrt(Math.pow(strecke[i].x - strecke[i + 1].x, 2) + Math.pow(strecke[i].y - strecke[i + 1].y, 2));
            }
            return laenge;
        }
    }
}
