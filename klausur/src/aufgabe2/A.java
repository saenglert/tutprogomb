package aufgabe2;

public class A {

    /* Aufgabe 2
    Zu welchers Ausgabe kommt es bei der Ausführung von B.main?
    */

    public int x;
    public A z;

    public void f() {
        System.out.println(x);
        if (x < 3)
            z.f();
    }
}
