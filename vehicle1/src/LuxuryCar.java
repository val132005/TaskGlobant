public class LuxuryCar extends Vehicle{

    public Boolean spareTire;
    public String licensePlate;
    public String transmissionType;

    public float mileage;
    public boolean navigationSystem;
    public boolean AdvancedSecuritySystem;
    public boolean parkingAssistant;

    public LuxuryCar(String color, String brand, String model, String type, int manufacturingYear, int serialNumber, int passengerCapacity, Boolean spareTire, String licensePlate, String transmissionType, float mileage, boolean navigationSystem, boolean AdvancedSecuritySystem, boolean parkingAssistant) {
        super(color, brand, model, type, manufacturingYear, serialNumber, passengerCapacity);
        this.spareTire = spareTire;
        this.licensePlate = licensePlate;
        this.transmissionType = transmissionType;
        this.mileage = mileage;
        this.navigationSystem = navigationSystem;
        this.AdvancedSecuritySystem = AdvancedSecuritySystem;
        this.parkingAssistant = parkingAssistant;
    }

    public void printLuxuryCar(){
        System.out.println("Luxury car data:");
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
        System.out.println("Mileage: " + this.mileage);
        System.out.println("Navigation system: " + this.navigationSystem);
        System.out.println("Advanced security system: " + this.AdvancedSecuritySystem);
        System.out.println("parking Assistant: " + this.parkingAssistant);
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

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(boolean navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public boolean isAdvancedSecuritySystem() {
        return AdvancedSecuritySystem;
    }

    public void setAdvancedSecuritySystem(boolean advancedSecuritySystem) {
        AdvancedSecuritySystem = advancedSecuritySystem;
    }

    public boolean isParkingAssistant() {
        return parkingAssistant;
    }

    public void setParkingAssistant(boolean parkingAssistant) {
        this.parkingAssistant = parkingAssistant;
    }

}
