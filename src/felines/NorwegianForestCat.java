package felines;
public class NorwegianForestCat extends Felis{

    public NorwegianForestCat()
    {
        vaccinationCount++;}
    public NorwegianForestCat(String name, int age, int shelterNo, int badgeNo, char size, char coat, String color, double weight) {
        super(name, age, shelterNo, badgeNo, size, coat, color, weight);
        vaccinationCount++;

    }

    public void miauwInNorvegian()
    {

    }

    @Override
    public String toString() {
        return "NorwegianForestCat " + super.toString();
    }

}

