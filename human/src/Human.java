
public class Human {
    private String name;
    private char gender; // f or m
    private int height; // Height in centimeters
    private int weight; // Weight in kilograms

    Human() {
        int random = (int) Math.round(Math.random());

        if(random == 0) {
            this.setGender('f');
        } else {
            this.setGender('m');
        }

        this.setName(Name.getRandom(this.gender));

        int min = 140;
        int max = 220;
        this.setHeight((int) (Math.round((Math.random() * (max - min)) + min)));

        min = 50;
        max = 250;
        this.setWeight((int) (Math.round((Math.random() * (max - min)) + min)));
    }

    Human(String name, char gender, int height, int weight) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains("Hitler")) {
            this.name = name.replace("Hitler", "Frank");
        } else {
            this.name = name;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'f' || gender == 'm') {
            this.gender = gender;
        } else {
            System.out.println("Falscher Input bei gender");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            this.weight = 1;
        } else {
            this.weight = weight;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    public double getBMI() {
        return this.weight / Math.pow(height / 100.0, 2);
    }

    public void printBMI() {
        System.out.println(this.name + " has a BMI of " + this.getBMI());
    }
}
