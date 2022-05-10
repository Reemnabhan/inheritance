package felines;


public class Felis extends Animal {
    protected static int vaccinationCount = 0;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    public Felis() {
        //vaccinationCount++;
    }

    public Felis(String name, int age, int shelterNo, int badgeNo, char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
        //  vaccinationCount++;

    }

    public void setShelterNo(int shelterNo) {
        if (shelterNo >= 0 && shelterNo <= 999)
            this.shelterNo = shelterNo;
    }

    public void setBadgeNo(int badgeNo) {
        if (badgeNo >= 0 && badgeNo <= 999)
            this.badgeNo = badgeNo;
    }

    public void miauw() {

    }

    public void miauw(int times) {

    }

    public static int getNoOfVaccinatedCats() {
        return vaccinationCount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Felis))
            return false;

        //casting
        Felis temp = (Felis) obj;

        if (this.badgeNo == temp.badgeNo && this.shelterNo == temp.shelterNo)
            return true;
        else
            return false;

    }


    @Override
    public String toString() {
        return "Felis name: " + name + ", age: " + age + ", shelterNo: " + shelterNo + ", badgeNo: " + badgeNo + ", " + super.toString();
    }
}
