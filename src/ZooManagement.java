import java.util.Scanner;
public class ZooManagement {

    public static void main(String[] args) {
        int nbrCages, animalAge, nbAnimals,choix;
        boolean animalMammal;
        Zoo myZoo= new Zoo("belvedere","tunis",10);
        String zooName, animalFamily, animalName, city, animalName2, animalName3;
        Aquatic aquatic= new Dolphin("p","aa",22,false,"bhar",125f);
        Aquatic aquatic1= new Penguin("p","fish",1,false,"oceon",22f);
        Aquatic aquatic2= new Penguin("p","fish",1,false,"oceon",23f);
        Terrestrial terrestrial= new Terrestrial("a","zz",10,true,2);
        Dolphin dolphin= new Dolphin("d","d",3,false,"bhar",200f);
        Penguin penguin= new Penguin("p","p",2,false,"bhar",100f);
        System.out.println(aquatic.toString());
        aquatic.swim();
        System.out.println(terrestrial.toString());
        System.out.println(dolphin.toString());
        dolphin.swim();
        System.out.println(penguin.toString());
        penguin.swim();

        myZoo.addAquaticAnimal(aquatic);
        myZoo.addAquaticAnimal(aquatic1);
        myZoo.addAquaticAnimal(aquatic2);
        for (int i=0;i<myZoo.aquaticAnimals.length;i++){
            if(myZoo.aquaticAnimals[i]!=null){
                myZoo.aquaticAnimals[i].swim();
            }

        }
        myZoo.displayNumberOfAquaticsByType();
        System.out.println("Max penguin swimming depth: "+myZoo.maxPenguinSwimmingDepth());
        System.out.println(aquatic1.equals(aquatic2));


        System.out.print("Entrez les informations du zoo: \n");
        do {
            Scanner reader5 = new Scanner(System.in);
            System.out.print("Entrez le nom du zoo : \n");
            zooName = reader5.nextLine();
        }while (zooName.equals(""));
        Scanner reader6 = new Scanner(System.in);
        System.out.print("Entrez le nom de la ville : \n");
        city = reader6.nextLine();
        do {
            Scanner reader7 = new Scanner(System.in);
            System.out.print("Entrez le nombre de cages (entre 1 et 25) : \n");
            nbrCages = reader7.nextInt();
        }while (nbrCages <=0 || nbrCages > 25);
        //Zoo myZoo = new Zoo(zooName,city,nbrCages);
        System.out.println(myZoo.toString());


        do {
            System.out.println("Welcome to the Zoo Management!");
            System.out.println("1. Ajouter un animal au zoo");
            System.out.println("2. Chercher un animal dans le zoo");
            System.out.println("3. Supprimer un animal du zoo");
            System.out.println("4. Afficher les animaux du zoo ");
            System.out.println("0. Quitter");
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Entrez votre choix: ");
                choix = sc.nextInt();
            }while (choix < 0 || choix > 4);
            switch (choix) {
                case 1:
                    System.out.println("Entrez les informations de l'animal: ");
                    Scanner reader1 = new Scanner(System.in);
                    System.out.println("Entrez la famille de l'animal: ");
                    animalFamily = reader1.nextLine();
                    Scanner reader2 = new Scanner(System.in);
                    System.out.println("Entrez le nom de l'animal: ");
                    animalName = reader2.nextLine();
                    do {
                        Scanner reader3 = new Scanner(System.in);
                        System.out.println("Entrez l'age de l'animal: ");
                        animalAge = reader3.nextInt();
                    }while (animalAge <0);
                    Scanner reader4 = new Scanner(System.in);
                    System.out.println("Est ce que cet animal est mammal?(mammal: true, non mammal: false): ");
                    animalMammal = reader4.nextBoolean();
                    Animal animal = new Animal(animalFamily,animalName,animalAge,animalMammal);
                    System.out.println(myZoo.addAnimal(animal));

                    break;
                case 2:
                    Scanner animName = new Scanner(System.in);
                    System.out.print("Entrez le nom de l'animal à chercher: \n");
                    animalName2 = animName.nextLine();
                    Animal anim = new Animal(animalName2);
                    System.out.println(myZoo.searchAnimal(anim));
                    break;
                case 3:
                    Scanner animNams = new Scanner(System.in);
                    System.out.print("Entrez le nom de l'animal à supprimer: \n");
                    animalName3 = animNams.nextLine();
                    Animal anim1 = new Animal(animalName3);
                    System.out.println(myZoo.removeAnimal(anim1));
                    break;
                case 4:
                    myZoo.displayZoo();

                    break;


            }
        }while(choix != 0);

    }


}

















