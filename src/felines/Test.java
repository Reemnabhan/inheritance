package felines;

public class Test {


    public static void main(String[] args) {
        //String name, int age, int shelterNo, int badgeNo, char size, char coat, String color, double weight)
        SiameseCat cat1 = new SiameseCat("Maya", 10, 333, 55, 'm', 'l',"White", 1.5 );
        PersianCat cat2 = new PersianCat("Leo", 5, 333, 55, 'l', 's',"grey", 2.5 );
        NorwegianForestCat cat3= new  NorwegianForestCat("Jack", 7, 393, 55, 'l', 's',"black", 2.7 );
        AndeanMountainCat cat4= new AndeanMountainCat("lolo", 6, 876, 995, 'l', 'l',"ginger", 3.7 );
        TurkishVanCat cat5= new TurkishVanCat("tito","turki", 2, 876, 995, 's', 'l',"white", 1.7 );
        PersianCat cat6 = new PersianCat("cake", 5, 88, 155, 'l', 's',"black", 4.5 );
        NorwegianForestCat cat7= new  NorwegianForestCat("jerry", 7, 657, 55, 'l', 's',"black", 2.7 );



        Animal[] cats= {cat1, cat2, cat3, cat4, cat5, cat6, cat7};

        System.out.println("The number of cats is "+Animal.animalCount);
        System.out.println("The number of vaccinated cats is "+Felis.getNoOfVaccinatedCats());

        System.out.println("***************************************************************************");
        if(cat1.equals(cat2))
        {
            System.out.println(cat1.toString());
            System.out.println("is the same as ");
            System.out.println(cat2.toString());
        }
        else
        {
            System.out.println(cat1.toString());
            System.out.println("is not the same as ");
            System.out.println(cat2.toString());
        }
        System.out.println("***************************************************************************");
        if(cat1.equals(cat3))
        {
            System.out.println(cat1.toString());
            System.out.println("is the same as ");
            System.out.println(cat3.toString());
        }
        else
        {
            System.out.println(cat1.toString());
            System.out.println("is not the same as ");
            System.out.println(cat3.toString());
        }
        System.out.println("***************************************************************************");

        System.out.println("\nDisplaying cats:");
        for(int i =0; i<cats.length;i++)
        {
            System.out.println(cats[i].toString());
        }



    }

}

