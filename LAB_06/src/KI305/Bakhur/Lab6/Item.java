package KI305.Bakhur.Lab6;

/**
 * Інтерфейс Item — описує об'єкт, який можна покласти в побутовий пакет.
 */
public interface Item extends Comparable<Item> {
    double getWeight();
    void printInfo();
}
