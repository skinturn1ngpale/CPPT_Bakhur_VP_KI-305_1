package KI305.Bakhur.Lab5;

import java.io.*;

/**
 * Клас CalcWFio — реалізує обчислення функції
 * y = sin(x)/cos(x) (варіант 3)
 * та методи читання/запису результатів у файли
 */
public class CalcWFio {
    private double x;       // вхідне значення
    private double result;  // результат обчислення

    /**
     * Метод обчислення функції
     * @param x вхідне значення (у градусах)
     */
    public void calculate(double x) {
        this.x = x;
        double radians = Math.toRadians(x);
        double cos = Math.cos(radians);
        if (Math.abs(cos) < 1e-10) {
            System.out.println("Помилка: cos(x) = 0, ділення на нуль!");
            result = Double.NaN;
            return;
        }
        result = Math.sin(radians) / cos; // y = tan(x)
    }

    /**
     * Метод запису результату у текстовий файл
     * @param fName ім’я файлу
     * @throws IOException якщо сталася помилка запису
     */
    public void writeResTxt(String fName) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(fName));
        out.printf("x = %.4f; y = %.4f%n", x, result);
        out.close();
    }

    /**
     * Метод запису результату у двійковий файл
     * @param fName ім’я файлу
     * @throws IOException якщо сталася помилка запису
     */
    public void writeResBin(String fName) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(fName));
        out.writeDouble(x);
        out.writeDouble(result);
        out.close();
    }

    /**
     * Метод читання результату з текстового файлу
     * @param fName ім’я файлу
     * @throws IOException якщо сталася помилка читання
     */
    public void readResTxt(String fName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fName));
        String line = in.readLine();
        in.close();
        System.out.println("Зчитано з текстового файлу: " + line);
    }

    /**
     * Метод читання результату з двійкового файлу
     * @param fName ім’я файлу
     * @throws IOException якщо сталася помилка читання
     */
    public void readResBin(String fName) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream(fName));
        double xVal = in.readDouble();
        double yVal = in.readDouble();
        in.close();
        System.out.printf("Зчитано з двійкового файлу: x = %.4f; y = %.4f%n", xVal, yVal);
    }

    /** Повертає результат обчислення */
    public double getResult() {
        return result;
    }
}
