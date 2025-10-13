package KI305.Bakhur.Lab4;

/**
 * Клас Equations — реалізує математичні обчислення
 * для функції варіанта 3: y = sin(x) / cos(x)
 */
public class Equations {

    /**
     * Метод для обчислення значення функції
     * @param x вхідне значення (у градусах)
     * @return результат обчислення y = sin(x) / cos(x)
     * @throws CalcException якщо cos(x) = 0 (ділення на нуль)
     */
    public double calculate(double x) throws CalcException {
        double radians = Math.toRadians(x);
        double cos = Math.cos(radians);

        if (Math.abs(cos) < 1e-10)
            throw new CalcException("Помилка: cos(x) = 0, ділення на нуль неможливе!");

        double sin = Math.sin(radians);
        return sin / cos; // тобто tan(x)
    }
}
