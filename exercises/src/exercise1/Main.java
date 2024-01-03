package exercise1;

import exercise1.Catalog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int decision;

        Catalog catalog = new Catalog();

        System.out.println("\nWelcome to the supermarket\n");



        do {

            System.out.println("Menu:");
            System.out.println("1. Add products to the catalog\n2. Show all products with their specifications.\n3. Show all products only with their price.\n4. Sell a product\n5. Exit");
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
                        System.out.println("Description: ");
                        String description = scanner.nextLine();
                        System.out.println("Stock: ");
                        int stock = scanner.nextInt();
                        System.out.println("Price: ");
                        double price = scanner.nextDouble();

                        if (id<=0 || name.length()>25 || description.length()>100 || stock<=0 || stock>1000 || price<=0 || price>7000000){
                            System.out.println("Values are out of range");
                        } else if (name.isEmpty() || description.isEmpty() ) {
                            System.out.println("The registry has empty values");
                        }else {
                            catalog.addProduct(id,name,description,stock,price);
                        }
                    }
                }
            } else if (option == 2) {

                catalog.showProducts();

            } else if (option == 3) {

                catalog.showProductsPrice();

            } else if (option == 4) {

                System.out.println("Type the code of the product you want to sell");
                int id = scanner.nextInt();
                catalog.sellProduct(id);
                catalog.showSpecificProducts(id);
                System.out.println();


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