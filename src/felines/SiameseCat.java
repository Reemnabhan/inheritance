package felines;

public class SiameseCat extends Felis{

    public SiameseCat() {
        vaccinationCount++;
    }

    public SiameseCat(String name, int age, int shelterNo, int badgeNo, char size, char coat, String color, double weight) {
        super(name, age, shelterNo, badgeNo, size, coat, color, weight);
        vaccinationCount++;
    }

    @Override
    public String toString() {
        return "SiameseCat " + super.toString();
    }

}

