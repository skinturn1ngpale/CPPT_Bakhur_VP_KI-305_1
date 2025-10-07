package KI305.Bakhur.Lab3;

import java.util.Scanner;

/**
 * Клас DogApp3 – головний клас для демонстрації спадкування та інтерфейсів
 */
public class DogApp3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть ім'я собаки: ");
        String name = in.nextLine();

        System.out.print("Вік (років): ");
        int age = in.nextInt();

        System.out.print("Вага (кг): ");
        double weight = in.nextDouble();

        // Створення піддослідного собаки
        TestDog dog = new TestDog(name, age, weight);

        System.out.println("\n--- Початкова інформація ---");
        dog.showInfo();

        System.out.println("\n--- Проведення експерименту ---");
        dog.bark();
        dog.testReaction();
        dog.reward();
        dog.birthday();

        System.out.println("\n--- Після експерименту ---");
        dog.fullInfo();

        in.close();
    }
}
