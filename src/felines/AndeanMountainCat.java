package felines;

public class AndeanMountainCat extends Felis{

    public AndeanMountainCat()
    {

    }
    public AndeanMountainCat(String name, int age, int shelterNo, int badgeNo, char size, char coat, String color, double weight) {
        super(name, age, shelterNo, badgeNo, size, coat, color, weight);
    }


    public void  miauw(String customSound)
    {

    }

    public boolean isAlive()
    {
        return false;
    }

    @Override
    public String toString() {
        return "AndeanMountainCat " + super.toString();
    }

}
