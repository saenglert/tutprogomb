public class Kreis {
    private int radius;

    Kreis() {
        this.radius = 5;
    }

    Kreis(int radius) {

    }

    public void setRadius(int radius) throws Exception {
        if (radius < 1) {
            throw new Exception("Falscher Radius");
        } else {
            this.radius = radius;
        }
    }

    public int getRadius() {
        return this.radius;
    }
}
