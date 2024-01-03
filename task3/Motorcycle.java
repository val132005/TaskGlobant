public class Motorcycle extends Vehicle{

    public int tankCapacity;
    public Boolean spareTire;

    public Motorcycle(String color, String brand, String model, String type, int manufacturingYear, Boolean spareTire, int tankCapacity) {
        super(color, brand, model, type, manufacturingYear);
        this.tankCapacity = tankCapacity;
        this.spareTire = spareTire;
    }

    public void printMotorcycle(){
        System.out.println("Motorcycle data:");
        System.out.println("Color: " + this.color);
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: "+ this.model);
        System.out.println("Type: "  + this.type);
        System.out.println("Manufacturing year: " + this.manufacturingYear);
        System.out.println("Spare tire: " + this.spareTire);
        System.out.println("TankCapacity: " + this.tankCapacity);
        System.out.println();
    }


    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public Boolean getSpareTire() {
        return spareTire;
    }

    public void setSpareTire(Boolean spareTire) {
        this.spareTire = spareTire;
    }


}
