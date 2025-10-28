package KI305.Bakhur.Lab5;

import java.io.IOException;
import java.util.Scanner;

/**
 * Клас FioApp — головний клас програми
 * Демонструє роботу з файлами у текстовому та двійковому форматах
 */
public class FioApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CalcWFio calc = new CalcWFio();

        System.out.print("Введіть значення x (у градусах): ");
        double x = in.nextDouble();

        calc.calculate(x);
        System.out.printf("Результат обчислення: y = %.4f%n", calc.getResult());

        try {
            // --- Запис результатів ---
            calc.writeResTxt("Result.txt");
            calc.writeResBin("Result.bin");
            System.out.println("Результати записано у файли Result.txt та Result.bin.");

            // --- Зчитування результатів ---
            calc.readResTxt("Result.txt");
            calc.readResBin("Result.bin");
        }
        catch (IOException e) {
            System.out.println("Помилка введення/виведення: " + e.getMessage());
        }

        System.out.println("Роботу програми завершено.");
        in.close();
    }
}
