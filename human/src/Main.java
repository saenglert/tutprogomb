
public class Main {
    public static void main(String[] args) {
        Human sascha = new Human("Sascha", 'm', 195, 103);
        Human adolf = new Human("Adolf Hitler", 'm', 173, 72);
        Human random = new Human();

        sascha.printBMI();
        adolf.printBMI();
        random.printBMI();
    }
}
