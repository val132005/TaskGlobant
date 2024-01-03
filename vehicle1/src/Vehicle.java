import javax.management.monitor.StringMonitor;

public class Vehicle {

    // Class attributes
    public String color;
    public String brand;
    public String model;
    public String type;
    public int manufacturingYear;
    public float weight;
    public int serialNumber;
    public String brakeType;
    
    public int passengerCapacity;
    

    // Constructors class
    public Vehicle(String color, String brand, String model, String type, int manufacturingYear, float weight, int serialNumber, String brakeType, int passengerCapacity){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.manufacturingYear = manufacturingYear;
        this.weight = weight;
        this.serialNumber =serialNumber;
        this.brakeType = brakeType;
        this.passengerCapacity = passengerCapacity;

    }


    public Vehicle(String color, String brand, String model, String type, int manufacturingYear, int serialNumber, int passengerCapacity) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.manufacturingYear = manufacturingYear;
        this.serialNumber =serialNumber;
        this.passengerCapacity = passengerCapacity;
    }

    public Vehicle(String color, String brand, String model, String type, int manufacturingYear, int serialNumber, String brakeType) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.manufacturingYear = manufacturingYear;
        this.serialNumber =serialNumber;
        this.brakeType = brakeType;
    }

    public Vehicle(String color, String brand, String model, String type, int manufacturingYear) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.manufacturingYear = manufacturingYear;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

}
