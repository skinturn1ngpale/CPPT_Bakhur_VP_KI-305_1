package KI305.Bakhur.Lab3;

/**
 * Abstract class Dog – базовий клас, що описує собаку
 * Містить спільні поля та методи для всіх собак
 */
public abstract class Dog {
    protected String name;
    protected int age;
    protected double weight;

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
}
