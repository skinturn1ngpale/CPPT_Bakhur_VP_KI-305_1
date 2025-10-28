package KI305.Bakhur.Lab6;

/**
 * Клас FoodItem — представляє харчовий продукт
 */
public class FoodItem implements Item {
    private String name;
    private double weight; // у грамах
    private int calories;

    public FoodItem(String name, double weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.weight, o.getWeight());
    }

    @Override
    public void printInfo() {
        System.out.printf("Продукт: %-10s | Вага: %.1f г | Калорійність: %d ккал%n",
                name, weight, calories);
    }
}
