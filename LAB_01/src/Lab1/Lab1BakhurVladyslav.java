package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Lab1БахурВладислав
 *
 * Варіант 3: заштрихована область – рівнобедрений трикутник з вершиною вниз,
 * що починається з верхнього рядка матриці.
 */
public class Lab1BakhurVladyslav {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть розмір квадратної матриці (ціле додатнє число): ");
        if (!in.hasNextInt()) {
            System.out.println("Некоректне значення розміру. Завершення програми.");
            return;
        }
        int n = in.nextInt();
        in.nextLine(); // з'їсти залишок рядка
        if (n <= 0) {
            System.out.println("Розмір має бути додатнім. Завершення програми.");
            return;
        }

        System.out.print("Введіть символ-заповнювач (саме 1 символ): ");
        String filler = in.nextLine();
        if (filler.length() != 1) {
            System.out.println("Треба ввести саме один символ. Завершення програми.");
            return;
        }
        char ch = filler.charAt(0);

        // зубчатий масив для варіанта 3
        char[][] arr = new char[(n + 1) / 2][];
        boolean[][] isFilled = new boolean[n][n];

        for (int i = 0; i < (n + 1) / 2; i++) {
            int count = n - 2 * i;        // кількість символів у рядку
            int start = i;                // відступ зліва
            arr[i] = new char[count];
            for (int j = 0; j < count; j++) {
                arr[i][j] = ch;
                isFilled[i][start + j] = true;
            }
        }

        // Вивід на екран
        System.out.println("\nСформований квадрат (символ '" + ch + "'):");
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (isFilled[i][j]) sb.append(ch).append(' ');
                else sb.append(' ').append(' ');
            }
            System.out.println(sb);
        }

        // Запис у файл
        File dataFile = new File("MyFile.txt");
        try (PrintWriter fout = new PrintWriter(dataFile)) {
            fout.println("Сформований квадрат (символ '" + ch + "'):");
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (isFilled[i][j]) sb.append(ch).append(' ');
                    else sb.append(' ').append(' ');
                }
                fout.println(sb);
            }
        }
        System.out.println("\nРезультат записано у файл: " + dataFile.getAbsolutePath());
    }
}
