package task6;

public class Oviparous extends Animal{

    private int incubationPeriod;
    private boolean externalProtection;

    public Oviparous(String name, String species, String color, int age, float weight, String originPlace, String feedingType, int incubationPeriod, boolean externalProtection) {
        super(name, species, color, age, weight, originPlace, feedingType);
        this.incubationPeriod = incubationPeriod;
        this.externalProtection = externalProtection;
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
        System.out.println("Incubation period: " + this.incubationPeriod);
        System.out.println("Have external protection: " + this.externalProtection);
        System.out.println();
    }

}
