package aufgabe1;

import java.util.Arrays;

public class Aufgabe1 {

    /* Aufgabe 1
    Gegeben ist ein Array von int-Werten. Schreiben Sie eine Klassenmethode f, die prüft, ob es in dem Array drei aufeinander folgende positive Zahlen gibt.
    Hinweis: Eine Zahl wird als positiv bezeichnet, wenn sie größer 0 ist.

    Die Klassenmethode f soll einen int-Array als Parameter haben und einen Rückgabewert vom Typ Boolean. Der Rückgabewert soll true annehmen, wenn es
    in dem Array drei aufeinander folgende positive Zahlen gibt und ansonsten den Wert false.
     */

    public static void main(String[] args) {

        // Aufgabe 1
        int[] a = createNewRandomIntArray(5);
        int[] b = createNewRandomIntArray(20);
        int[] c = createNewRandomIntArray(30);

        System.out.println("############");
        System.out.println("Aufgabe 1");
        System.out.println("############");
        System.out.println(Arrays.toString(a));
        System.out.println("Test für Array a ist " + Aufgabe1.f(a));
        System.out.println(Arrays.toString(b));
        System.out.println("Test für Array b ist " + Aufgabe1.f(b));
        System.out.println(Arrays.toString(c));
        System.out.println("Test für Array c ist " + Aufgabe1.f(c));
        System.out.println("############");

    }

    public static int[] createNewRandomIntArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        return array;
    }

    public static boolean f(int[] array) {
        int counter = 0;

        for (int number : array) {
            // % == Modulo. 2 % 2 = 0 Kein Rest. 3 % 1 = 1 Rest.
            // Wenn kein Rest übrigbleibt ist die Zahl also gerade.
            if (number % 2 == 0) counter++;
            else counter = 0;

            if (counter >= 3) return true;
        }

        return false;
    }
}
