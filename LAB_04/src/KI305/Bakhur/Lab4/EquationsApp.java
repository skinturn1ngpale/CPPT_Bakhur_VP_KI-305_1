package KI305.Bakhur.Lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Головний клас програми — демонструє роботу з винятками
 * та запис результатів у файл
 */
public class EquationsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Equations eq = new Equations();

        System.out.print("Введіть ім'я файлу для збереження результату: ");
        String fileName = in.nextLine();

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {

            System.out.print("Введіть значення x (у градусах): ");
            double x = in.nextDouble();

            try {
                double result = eq.calculate(x);
                System.out.printf("Результат обчислення: y = %.4f%n", result);
                writer.printf("x = %.4f; y = %.4f%n", x, result);
            } 
            catch (CalcException e) {
                System.out.println("Помилка обчислення: " + e.getMessage());
                writer.println("Помилка обчислення: " + e.getMessage());
            }

        } 
        catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        } 
        finally {
            System.out.println("Роботу програми завершено.");
        }

        in.close();
    }
}
