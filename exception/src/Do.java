public class Do {
    public static void main(String[] args) {
        Kreis kreis = new Kreis();
        try {
            System.out.println("Erster Versuch");
            kreis.setRadius(324);
            System.out.println(kreis.getRadius());
            System.out.println("Zweiter Versuch");
            kreis.setRadius(-324);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(kreis.getRadius());
        }

    }
}
