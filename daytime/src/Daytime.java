
public class Daytime {

    private int stunden, minuten, sekunden;
    static boolean ampm = false;

    Daytime(int stunden, int minuten, int sekunden) {
        this.setStunden(stunden);
        this.minuten = minuten;
        this.sekunden = sekunden;
    }

    Daytime(int stunden, int minuten) {

    }

    public void setStunden(int stunden) {
        if(stunden > 24) {
            this.stunden = 24;
        } else if (stunden < 0) {
            this.stunden = 0;
        } else {
            this.stunden = stunden;
        }
    }

    public int getStunden() {
        return this.stunden;
    }

    public int sekundenSeitMitternacht() {
        return 1;
    }

    public String toString() {
        if(ampm) {
            int stunde;
            if (this.stunden <= 12) {
                if (this.stunden == 0) {
                    stunde = 12;
                } else {
                    stunde = this.stunden;
                }
                return stunde + ":" + this.minuten + ":" + this.sekunden + " am";
            } else {
                stunde = this.stunden - 12;
                return stunde + ":" + this.minuten + ":" + this.sekunden + " pm";
            }
        } else {
            return this.stunden + ":" + this.minuten + ":" + this.sekunden;
        }
    }

    public boolean vormittag() {
        return true;
    }

    public void vorstellen(int stunden, int minuten, int sekunden) {
        System.out.println("Vorstellen start");
        // Doing stuff
        System.out.println("Vorstellen ende");
    }

    public boolean istFrueherAls(Daytime daytime) {
        return true;
    }

}
