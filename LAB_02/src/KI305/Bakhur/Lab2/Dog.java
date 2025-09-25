/**
 * 
 */
package KI305.Bakhur.Lab2;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Class <code>Dog</code> implements model of a dog.
 * @author Владислав
 * @version 1.0
 */
public class Dog {

    private Breed breed;
    private Collar collar;
    private Owner owner;

    private String name;
    private int age;
    private double weight;

    private PrintWriter fout;

    /**
     * Default constructor
     * @throws FileNotFoundException if log file cannot be created
     */
    public Dog() throws FileNotFoundException {
        this("Безіменний", 1, 5.0, new Breed("Мішаний"), new Collar("червоний"), new Owner("Невідомий"));
    }

    /**
     * Constructor with basic parameters
     */
    public Dog(String name, int age, double weight, Breed breed, Collar collar, Owner owner) throws FileNotFoundException {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.collar = collar;
        this.owner = owner;
        fout = new PrintWriter(new File("DogLog.txt"));
        log("Dog created: " + name);
    }

    // --- Методи ---

    public void bark() {
        log(name + " гавкає: Гав-Гав!");
    }

    public void eat(String food) {
        log(name + " їсть " + food);
        weight += 0.1;
    }

    public void play() {
        log(name + " грається з м'ячиком");
    }

    public void sleep() {
        log(name + " спить");
    }

    public void walk() {
        log(name + " гуляє на вулиці");
    }

    public void birthday() {
        age++;
        log(name + " святкує день народження, йому тепер " + age + " років");
    }

    public String getInfo() {
        return "Dog[name=" + name + ", age=" + age + ", weight=" + weight +
                ", breed=" + breed.getName() + ", owner=" + owner.getName() + "]";
    }

    public void changeOwner(Owner newOwner) {
        log(name + " змінив власника на " + newOwner.getName());
        this.owner = newOwner;
    }

    public void putOnCollar(String color) {
        collar.setColor(color);
        log(name + " отримав новий " + color + " ошийник!");
    }

    public void dispose() {
        log("Закриваємо лог для " + name);
        fout.close();
    }

    // --- приватний метод логування ---
    private void log(String msg) {
        fout.println(msg);
        fout.flush();
        System.out.println(msg);
    }
}
