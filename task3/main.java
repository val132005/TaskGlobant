import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Bike bike1 = new Bike("Red", "BikeXas", "Bike Anonymous", "Of changes", 2021,
                2376, "Disck brakes");
        bike1.printBike();



        Car car1 = new Car("Orange", "Kia", "Kia Picanto", "4X2", 2013, 1232332,
                4, true, "utd345", "Automatico");
        car1.printCar();



        LuxuryCar luxuryCar1 = new LuxuryCar("Black", "Mercedes Benz", "Luxury Benz", "Convertible",
                2022, 2345, 4, true, "DFHJ6785",
                "Automatic", 7.4f, true, true, true);

        luxuryCar1.printLuxuryCar();

        Motorcycle motorcycle1 = new Motorcycle("Blue", "Lexus", "Lexus 2000", "Ligera", 2005,
                true, 3);
        motorcycle1.printMotorcycle();


        MountainBike mountainBike1 = new MountainBike("Yellow", "Bike MOUN", "new 2000", "of changes",
                2028, 2232, "Disck brakes", 3.5f, true, true);
        mountainBike1.printMountainBike();

    }





}
