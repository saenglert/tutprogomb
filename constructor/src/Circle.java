public class Circle {
    Circle() {
        System.out.println("Kreis erstellt");
    }

    Circle(int x, int y) {
        System.out.println("Kreis mit Koordinaten erstellt");
    }

    public void setCoordinates(int x, int y) {
        System.out.println("Koordinaten gesetzt");
    }
}
