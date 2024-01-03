public class Car extends Vehicle{

    public Boolean spareTire;
    public String licensePlate;
    public String transmissionType;


    public Car(String color, String brand, String model, String type, int manufacturingYear, int serialNumber, int passengerCapacity, Boolean spareTire, String licensePlate, String transmissionType) {
        super(color, brand, model, type, manufacturingYear, serialNumber, passengerCapacity);
        this.spareTire = spareTire;
        this.licensePlate = licensePlate;
        this.transmissionType = transmissionType;
    }

    public void printCar(){
        System.out.println("Car data:");
        System.out.println("Color: " + this.color);
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: "+ this.model);
        System.out.println("Type: "  + this.type);
        System.out.println("Manufacturing year: " + this.manufacturingYear);
        System.out.println("Serial number: " + this.serialNumber);
        System.out.println("Passenger capacity: " + this.passengerCapacity);
        System.out.println("Spare tire: " + this.spareTire);
        System.out.println("license plate: " + this.licensePlate);
        System.out.println("Transmission type: " + this.transmissionType);
        System.out.println();
    }


    public Boolean getSpareTire() {
        return spareTire;
    }

    public void setSpareTire(Boolean spareTire) {
        this.spareTire = spareTire;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }


}
