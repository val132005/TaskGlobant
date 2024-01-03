public class MountainBike extends Bike{

    public float weight;
    public boolean dualSuspension;
    public boolean adjustableSeat;

    public MountainBike(String color, String brand, String model, String type, int manufacturingYear,
                        int serialNumber, String brakeType, float weight, boolean dualSuspension,
                        boolean adjustableSeat) {
        super(color, brand, model, type, manufacturingYear, serialNumber, brakeType);
        this.weight = weight;
        this.dualSuspension = dualSuspension;
        this.adjustableSeat = adjustableSeat;
    }

    public void printMountainBike(){
        System.out.println("Mountain bike data:");
        System.out.println("Color: " + this.color);
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: "+ this.model);
        System.out.println("Type: "  + this.type);
        System.out.println("Manufacturing year: " + this.manufacturingYear);
        System.out.println("Serial number: " + this.serialNumber);
        System.out.println("Brake type: " + this.brakeType);
        System.out.println("Weight: " + this.weight);
        System.out.println("Dual suspension: " + this.weight);
        System.out.println("Adjustable Seat: " + this.adjustableSeat);
        System.out.println();
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isDualSuspension() {
        return dualSuspension;
    }

    public void setDualSuspension(boolean dualSuspension) {
        this.dualSuspension = dualSuspension;
    }

    public boolean isAdjustableSeat() {
        return adjustableSeat;
    }

    public void setAdjustableSeat(boolean adjustableSeat) {
        this.adjustableSeat = adjustableSeat;
    }

}
