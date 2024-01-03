package task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Viviparous viviparous1 = new Viviparous("Tiger", "Mammal", "Orange", 5, 150.5f, "Africa", "Carnivore", 100, true);
        Viviparous viviparous2 = new Viviparous("Dolphin", "Mammal", "Gray", 10, 300.2f, "Ocean", "Piscivore", 200, true);
        Viviparous viviparous3 = new Viviparous("Elephant", "Mammal", "Gray", 20, 500.7f, "Asia", "Herbivore", 660, true);



        Oviparous oviparous1 = new Oviparous("Snake", "Reptile", "Green", 3, 2.5f, "Forest", "Carnivore", 40, false);
        Oviparous oviparous2 = new Oviparous("Turtle", "Reptile", "Brown", 5, 5.8f, "Lake", "Herbivore", 60, true);
        Oviparous oviparous3 = new Oviparous("Crocodile", "Reptile", "Gray", 8, 300.7f, "River", "Carnivore", 90, true);


        Ovoviviparous ovoviviparous1 = new Ovoviviparous("Shark", "Fish", "Gray", 5, 200.3f, "Ocean", "Piscivore", 8, true);
        Ovoviviparous ovoviviparous2 = new Ovoviviparous("Boa Constrictor", "Reptile", "Brown", 7, 10.5f, "Forest", "Carnivore", 4, true);
        Ovoviviparous ovoviviparous3 = new Ovoviviparous("Stingray", "Fish", "Black", 3, 15.7f, "Ocean", "Piscivore", 6, true);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Zoo");
        int decision = 1;
        do {
            System.out.println("please select the type of animal you wish to consult");
            System.out.println("1. Viviparous\n2. Oviparous\n3. Ovoviviparous");
            int selection = scanner.nextInt();

            switch (selection){
                case 1:
                    viviparous1.printAnimal();
                    viviparous2.printAnimal();
                    viviparous3.printAnimal();
                    break;
                case 2:
                    oviparous1.printAnimal();
                    oviparous2.printAnimal();
                    oviparous3.printAnimal();
                    break;
                case 3:
                    ovoviviparous1.printAnimal();
                    ovoviviparous2.printAnimal();
                    ovoviviparous3.printAnimal();
                    break;
                default:
                    System.out.println("Invalid option");
            }

            System.out.println("Would you like to see the menu again?\n1. Yes\n2. No");
            decision = scanner.nextInt();

        }while (decision==1);

    }



}
