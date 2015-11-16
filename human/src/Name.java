
public class Name {
    static String[] maleNames = {"Moritz", "Sascha", "Florian", "Nico", "Adrian", "Arthur"};
    static String[] femaleNames = {"Sarah", "Sabrina", "Jana", "Richarda", "Josephine"};

    public static String getRandom(char gender) {
        if (gender != 'f' && gender != 'm') {
            System.out.println("Fehler bei Gender");
        }

        int index;

        if (gender == 'f') {
            index = (int) (Math.floor(Math.random() * femaleNames.length));
            return femaleNames[index];
        } else {
            index = (int) (Math.floor(Math.random() * maleNames.length));
            return maleNames[index];
        }


    }
}
