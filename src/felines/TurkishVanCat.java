package felines;
public class TurkishVanCat extends Felis {
    public String nickname;

    public TurkishVanCat()
    {
        vaccinationCount++;}
    public TurkishVanCat(String nickname, String name, int age, int shelterNo, int badgeNo, char size, char coat, String color, double weight) {
        super(name, age, shelterNo, badgeNo, size, coat, color, weight);
        this.nickname = nickname;
        vaccinationCount++;
    }

    @Override
    public String toString() {
        return "TurkishVanCat nickname=" + nickname + super.toString();
    }


}


