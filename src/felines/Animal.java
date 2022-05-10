package felines;

public abstract class Animal {
    protected static int animalCount=0;
    private char size;
    private char coat;
    private String color;
    private double weight;

    public Animal()
    {
        animalCount++;
    }

    public Animal(char size, char coat, String color, double weight)
    {
        this.size=size;
        this.coat=coat;
        this.color=color;
        this.weight=weight;
        animalCount++;
    }
    public void makeNoise(String sount)
    {
        System.out.println(sount);
    }

    public void eat()
    {
        System.out.println("Animal is eating");
    }

    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }

    public boolean isAlive()
    {
        return true;
    }


    public static int getAnimalCount()
    {
        return animalCount;
    }
    @Override
    public String toString()
    {
        return "size: "+size+", coat: "+coat+", color: "+color+", weight: "+weight;
    }

}