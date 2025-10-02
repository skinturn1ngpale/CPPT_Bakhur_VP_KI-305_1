package KI305.Bakhur.Lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DogApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        // --- Ввід даних ---
        System.out.print("Введіть ім'я собаки: ");
        String name = in.nextLine();

        System.out.print("Вік (років): ");
        int age = in.nextInt();

        System.out.print("Вага (кг): ");
        double weight = in.nextDouble();
        in.nextLine(); // очистити \n після чисел

        System.out.print("Порода: ");
        String breedName = in.nextLine();

        System.out.print("Колір ошийника: ");
        String collarColor = in.nextLine();

        System.out.print("Ім'я власника: ");
        String ownerName = in.nextLine();

        // --- Створення собаки ---
        Dog dog = new Dog(name, age, weight,
                new Breed(breedName),
                new Collar(collarColor),
                new Owner(ownerName));

        // --- Вивід початкових даних ---
        System.out.println("\n--- Початкові дані собаки ---");
        System.out.println(dog.getInfo());

        // --- Виклик методів, що змінюють стан ---
        dog.birthday();
        dog.eat("кістку");
        dog.putOnCollar("зелений");
        dog.changeOwner(new Owner("Марія"));

        // --- Вивід оновлених даних ---
        System.out.println("\n--- Дані після змін ---");
        System.out.println(dog.getInfo());

        dog.dispose();
        in.close();
    }
}