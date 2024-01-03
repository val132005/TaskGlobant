package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your calculator");
        int decision = 1;

        do {

            System.out.println("Enter the first number");
            double num1 = scanner.nextInt();
            System.out.println("Enter the second number");
            double num2 = scanner.nextInt();

            System.out.println();
            System.out.println("Please select the number corresponding to the operation you wish to execute.");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            int operation = scanner.nextInt();

            Calculator calculator = new Calculator(num1, num2);

            System.out.println();

            switch (operation){
                case 1:
                    System.out.printf("%5.0f%5s%5.0f%5s%8.2f%n", num1, "+", num2, "=", calculator.addition());
                    break;
                case 2:
                    System.out.printf("%5.0f%5s%5.0f%5s%8.2f%n", num1, "-", num2, "=", calculator.substraction());
                    break;
                case 3:
                    System.out.printf("%5.0f%5s%5.0f%5s%8.2f%n", num1, "*", num2, "=", calculator.multiplication());
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("It is not possible to divide by 0");
                    }else {
                        System.out.printf("%5.0f%5s%5.0f%5s%8.2f%n", num1, "/", num2, "=", calculator.division());
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println();
            System.out.println("Do you wish to execute another operation?\n1. Yes\n2. No");
            decision = scanner.nextInt();
            System.out.println();

        }while (decision==1);







    }
}
