package task6;

public class Ovoviviparous extends Animal{
    private int incubationPeriod;
    private boolean internalProtection;

    public Ovoviviparous(String name, String species, String color, int age, float weight, String originPlace, String feedingType, int incubationPeriod, boolean internalProtection) {
        super(name, species, color, age, weight, originPlace, feedingType);
        this.incubationPeriod = incubationPeriod;
        this.internalProtection = internalProtection;
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
        System.out.println("Have internal protection: " + this.internalProtection);

        System.out.println();
    }

}
