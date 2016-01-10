package aufgabe2;

public class B {

    /* Aufgabe 2
    Zu welchers Ausgabe kommt es bei der Ausführung von B.main?
    */

    public static A g(int x1, int x2) {
        A a1 = new A();
        a1.x = x1;
        A a2 = new A();
        a2.x = x2;
        a1.z = a2;
        a2.z = a1;
        return a1;
    }

    public static void main(String[] args) {
        A p = g(0, 5);
        p.f();
        System.out.println("---");
        p = g(2, 1);
        p.f();
    }
}
