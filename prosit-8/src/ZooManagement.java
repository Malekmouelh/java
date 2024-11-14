import java.util.Scanner;
public class ZooManagement {

    public static void main(String[] args) {
        int nbrCages, animalAge, nbAnimals,choix;
        boolean animalMammal;
        String zooName, animalFamily, animalName, city, animalName2, animalName3;



        Zoo myZoo = new Zoo("belvedere","tunis",3);
        Animal a1=new Animal("cat","lion",4,true);
        Animal a2=new Animal("dog","wolf",6,true);
        Animal a3=new Animal("fish","jellyfish",1,false);
        Animal a4=new Animal("dog","dogg",-2,false);

        try {
            myZoo.addAnimal(a1);
            System.out.println("Nombre d'animaux : " + myZoo.nbAnimals());
            myZoo.addAnimal(a2);
            System.out.println("Nombre d'animaux : " + myZoo.nbAnimals());
            myZoo.addAnimal(a3);
            System.out.println("Nombre d'animaux : " + myZoo.nbAnimals());
            myZoo.addAnimal(a4); // Ce dernier ajout doit déclencher ZooFullException

        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        Terrestrial t=new Terrestrial();
        System.out.println("t eats: ");
        t.eatPlantAndMeet(Food.MEAT);

        Dolphin d=new Dolphin();
        System.out.println("d eats: ");
        d.eatMeat(Food.MEAT);

        Penguin p=new Penguin();
        System.out.println("p eats: ");
        p.eatMeat(Food.MEAT);
        Aquatic a= new Aquatic() {
            @Override
            public void swim() {
                System.out.println("Aquatic swimming");
            }

            @Override
            public void eatMeat(Object meat) {
                System.out.println("Aquatic eat Meat");
            }
        };
        System.out.println("a eats: ");
        d.eatMeat(Food.PLANT);

        Aquatic aq=new Penguin("pip","houta",5,true,"ocean1",200f);
        Aquatic aquatic=new Dolphin("fish","dolphin",3,true,"ocean",50f);
        Aquatic aquatic1=new Penguin("houta","houta",5,false,"ocean1",100f);
        Terrestrial terrestrial=new Terrestrial("dog","wolf",5,true,4);
        Dolphin dolphin=new Dolphin("big fish","dolphin",6,true,"pacific ocean",4);
        Penguin penguin=new Penguin("birds","penquin",10,true,"north pole",40);

        System.out.println(aq.equals(aquatic));

        System.out.println(aquatic.toString());
        System.out.println(aquatic1.toString());
        System.out.println(terrestrial.toString());
        System.out.println(dolphin.toString());
        System.out.println(penguin.toString());

        myZoo.addAquaticAnimal(aquatic);
        myZoo.addAquaticAnimal(aquatic1);
        myZoo.addAquaticAnimal(aq);
        System.out.println("Swim des aquatiques:");
        for (int i=0;i < myZoo.aquaticAnimals.length;i++){
            if(myZoo.aquaticAnimals[i]!=null) {
                myZoo.aquaticAnimals[i].swim();
            }
        }
        myZoo.displayNumberOfAquaticsByType();
        System.out.println("Max Penguin Swimming Depth: "+myZoo.maxPenguinSwimmingDepth());

       

    }


}










