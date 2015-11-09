
public class Haus {
    private String dachart = "Spitzdach";
    private int anzahlfenster = 5;
    public int[] grundfläche = new int[2];

    public String getDachart() {
        return dachart;
    }

    public void setDachart(String dachart) {

        this.dachart = dachart;
    }

    public int getAnzahlfenster() {
        return anzahlfenster;
    }

    public void setAnzahlfenster(int anzahlfenster) {
        if(anzahlfenster >= 0) {
            this.anzahlfenster = anzahlfenster;
        } else {
            this.anzahlfenster = 0;
        }
    }
}
