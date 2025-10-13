package KI305.Bakhur.Lab3;

/**
 * Abstract class Dog – базовий клас, що описує собаку
 * Містить спільні поля та методи для всіх собак
 */
public abstract class Dog {
    private String name;
    private int age;
    private double weight;

    /**
     * Конструктор
     * @param name ім'я собаки
     * @param age  вік собаки
     * @param weight вага собаки
     */
    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /** Абстрактний метод, який реалізується у підкласах */
    public abstract void bark();

    /** Метод виводить основну інформацію про собаку */
    public void showInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Вага: " + weight + " кг");
    }

    /** Збільшення віку */
    public void birthday() {
        age++;
        System.out.println(name + " святкує день народження! Йому тепер " + age + " років.");
    }

    // --- Гетери і сетери ---
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(double weight) { this.weight = weight; }
}
