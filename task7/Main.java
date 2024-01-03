package task7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a su supermercado");
        System.out.println("Menu:");

        int decision = 1;

        System.out.println("Cuantos productos desea agregar?");
        int num = scanner.nextInt();
        Product[] products = new Product[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Product code: ");
            int productCode = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Product name: ");
            String productName = scanner.nextLine();
            System.out.println("Unit of measure: ");
            String unitMeasure = scanner.nextLine();
            System.out.println("Description: ");
            String description = scanner.nextLine();
            System.out.println("Price: ");
            float price = scanner.nextFloat();

            products[i] = new Product(productCode, productName, unitMeasure, description, price);
        }

        do {
            System.out.println("2. Eliminar producto\n3. Vender producto\n4. Consultar productos");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el código del producto que desea eliminar: ");
                    int codeToDelete = scanner.nextInt();

                    boolean found = false;
                    for (int i = 0; i < num; i++) {
                        if (products[i].getProductCode() == codeToDelete) {

                            System.out.println("Producto eliminado:");
                            System.out.println("Product name: " + products[i].getProductName());
                            System.out.println("Product code: " + products[i].getProductCode());
                            System.out.println("Unit of measure: " + products[i].getUnitMeasure());
                            System.out.println("Description: " + products[i].getDescription());
                            System.out.println("Price: " + products[i].getPrice());

                            // Eliminar el producto y reorganizar el array
                            for (int j = i; j < num - 1; j++) {
                                products[j] = products[j + 1];
                            }

                            // Reducir la longitud del array
                            num--;

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Producto no encontrado con el código proporcionado.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el código del producto que desea vender: ");
                    int codeToSell = scanner.nextInt();

                    boolean foundForSale = false;
                    for (int i = 0; i < num; i++) {
                        if (products[i].getProductCode() == codeToSell) {
                            // Registrar la venta
                            System.out.println("Venta registrada:");
                            System.out.println("Product name: " + products[i].getProductName());
                            System.out.println("Product code: " + products[i].getProductCode());
                            System.out.println("Unit of measure: " + products[i].getUnitMeasure());
                            System.out.println("Description: " + products[i].getDescription());
                            System.out.println("Price: " + products[i].getPrice());

                            // Eliminar el producto vendido y reorganizar el array
                            for (int j = i; j < num - 1; j++) {
                                products[j] = products[j + 1];
                            }

                            // Reducir la longitud del array
                            num--;

                            foundForSale = true;
                            break;
                        }
                    }

                    if (!foundForSale) {
                        System.out.println("Producto no encontrado con el código proporcionado.");
                    }
                    break;
                case 4:
                    for (int i = 0; i < num; i++) {
                        System.out.println("Product name: " + products[i].getProductName());
                        System.out.println("Product code: " + products[i].getProductCode());
                        System.out.println("Unit of measure: " + products[i].getUnitMeasure());
                        System.out.println("Description: " + products[i].getDescription());
                        System.out.println("Price: " + products[i].getPrice());
                        System.out.println();
                    }
                    break;

            }
            System.out.println("Do you wish continue?\n1. Yes\n2. No");
            decision = scanner.nextInt();
            System.out.println();
        } while (decision == 1);
    }
}