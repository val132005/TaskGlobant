public class Bike extends Vehicle{

    public Bike(String color, String brand, String model, String type, int manufacturingYear, int serialNumber, String brakeType) {
        super(color, brand, model, type, manufacturingYear, serialNumber, brakeType);
    }


    public void printBike(){
        System.out.println("Bike data:");
        System.out.println("Color: " + this.color);
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: "+ this.model);
        System.out.println("Type: "  + this.type);
        System.out.println("Manufacturing year: " + this.manufacturingYear);
        System.out.println("Serial number: " + this.serialNumber);
        System.out.println("Brake Type: " + this.brakeType);
        System.out.println();
    }

}
