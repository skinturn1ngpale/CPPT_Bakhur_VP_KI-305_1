package KI305.Bakhur.Lab6;

/**
 * Клас Appliance — представляє побутову техніку
 */
public class Appliance implements Item {
    private String name;
    private double weight; // у кг
    private int power; // потужність, Вт

    public Appliance(String name, double weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public double getWeight() {
        return weight * 1000; // переводимо у грами для порівняння
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.getWeight(), o.getWeight());
    }

    @Override
    public void printInfo() {
        System.out.printf("Техніка: %-10s | Вага: %.1f кг | Потужність: %d Вт%n",
                name, weight, power);
    }
}
