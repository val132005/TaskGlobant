package homework1;

import exercise1.Catalog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);
        int decision;

        System.out.println("\nWelcome to the Restaurant\n");



        do {

            System.out.println("Menu:");
            System.out.println("1. Add products to the Menu\n2. Replace some option.\n3. Print the amount of recipes on the menu.\n4. Print the whole menu specifying name and price..\n5. Exit");
            System.out.println();
            System.out.println("Type the option you want to execute");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1){

                scanner.nextLine();
                System.out.println("How many products would you like to add?");
                int numProducts = scanner.nextInt();


                if (numProducts<=0){
                    System.out.println("Value must be greater than 0");
                }else {
                    for (int i = 1; i <= numProducts; i++) {
                        scanner.nextLine();
                        System.out.println("\nAdd product #"+i+"\n");
                        System.out.println("Id: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Name: ");
                        String name = scanner.nextLine();
                        System.out.println("Price: ");
                        double price = scanner.nextDouble();

                        if (id<=0 || name.length()>25 || price<=0 || price>7000000){
                            System.out.println("Values are out of range");
                        } else if (name.isEmpty()) {
                            System.out.println("The registry has empty values");
                        }else {
                            menu.addProduct(id, name, price);
                        }
                    }
                }
            } else if (option == 2) {

                System.out.println("Type the code of the product you want to sell");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Price: ");
                double price = scanner.nextDouble();

                menu.modifyProduct(id,name, price);

            } else if (option == 3) {

                menu.showNumberProducts();

            } else if (option == 4) {

                menu.showAllProducts();

            } else if (option == 5) {

            }else {

            }
            System.out.println();
            System.out.println("You want to see the menu again \n1.Yes \n2. No");
            decision = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
        }while (decision == 1);











    }
}



