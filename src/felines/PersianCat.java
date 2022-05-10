package felines;
public class PersianCat extends Felis{

    public PersianCat(String name, int age, int shelterNo, int badgeNo, char size, char coat, String color, double weight) {
        super(name, age, shelterNo, badgeNo, size, coat, color, weight);
        vaccinationCount++;
    }

    @Override
    public String toString() {
        return "PersianCat " + super.toString();
    }

    public void miauw()
    {

    }


}


