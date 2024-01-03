package task6;

public class Viviparous extends Animal{
    private int gestationPeriod;
    private boolean placentaPresent;

    public Viviparous(String name, String species, String color, int age, float weight, String originPlace, String feedingType, int gestationPeriod, boolean placentaPresent) {
        super(name, species, color, age, weight, originPlace, feedingType);
        this.gestationPeriod = gestationPeriod;
        this.placentaPresent = placentaPresent;
    }


    public void printAnimal() {
        System.out.println("Animal data:");
        System.out.println("Name: " + this.name);
        System.out.println("Species: " + this.species);
        System.out.println("Color: " + this.color);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
        System.out.println("Origin: " + this.originPlace);
        System.out.println("Feeding type: " + this.feedingType);
        System.out.println("Gestation period: " + this.gestationPeriod);
        System.out.println("Have a placenta: " + this.placentaPresent);
        System.out.println();
    }

}
