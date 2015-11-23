
public class Main {
    public static void main(String[] args) {
        Human sascha = new Human("Sascha", 'm', 195, 103);
        Human adolf = new Human("Adolf Hitler", 'm', 173, 72);
        Human random = new Human();

        System.out.println("With a weight of " + sascha.getWeight() + " kg and height of " + sascha.getHeight() + " " + sascha.getName() + "has BMI of " + sascha.getBMI());
        System.out.println("With a weight of " + adolf.getWeight() + " kg and height of " + adolf.getHeight() + " " + adolf.getName() + "has BMI of " + adolf.getBMI());
        System.out.println("With a weight of " + random.getWeight() + " kg and height of " + random.getHeight() + " " + random.getName() + "has BMI of " + random.getBMI());
    }
}
