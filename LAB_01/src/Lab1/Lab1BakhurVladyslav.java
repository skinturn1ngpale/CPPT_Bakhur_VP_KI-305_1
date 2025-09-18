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
        in.nextLine();
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

        // створюємо зубчатий масив
        // кількість рядків = (n+1)/2
        char[][] triangle = new char[(n + 1) / 2][];
        for (int i = 0; i < triangle.length; i++) {
            int count = n - 2 * i; // довжина рядка
            triangle[i] = new char[count];
            for (int j = 0; j < count; j++) {
                triangle[i][j] = ch;
            }
        }

        // Вивід на екран
        System.out.println("\nСформований квадрат (символ '" + ch + "'):");
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                // малюємо символ, якщо цей стовпець входить у зубчатий рядок
                if (i < triangle.length) {
                    int start = i;                      // зсув зліва
                    int end = start + triangle[i].length; // де закінчується ряд
                    if (j >= start && j < end) {
                        sb.append(triangle[i][j - start]).append(' ');
                    } else {
                        sb.append(' ').append(' ');
                    }
                } else {
                    sb.append(' ').append(' ');
                }
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
                    if (i < triangle.length) {
                        int start = i;
                        int end = start + triangle[i].length;
                        if (j >= start && j < end) {
                            sb.append(ch).append(' ');
                        } else {
                            sb.append(' ').append(' ');
                        }
                    } else {
                        sb.append(' ').append(' ');
                    }
                }
                fout.println(sb);
            }
        }

        System.out.println("\nРезультат записано у файл: " + dataFile.getAbsolutePath());
    }
}

