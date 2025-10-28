package KI305.Bakhur.Lab6;

import java.util.ArrayList;

/**
 * Параметризований клас HouseholdPackage<T>
 * — моделює побутовий пакет, який може містити об'єкти різних типів
 */
public class HouseholdPackage<T extends Item> {
    private ArrayList<T> items;

    public HouseholdPackage() {
        items = new ArrayList<>();
    }

    /** Додає елемент у пакет */
    public void addItem(T item) {
        items.add(item);
        System.out.print("Додано елемент: ");
        item.printInfo();
    }

    /** Видаляє елемент за індексом */
    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            System.out.print("Видалено: ");
            items.get(index).printInfo();
            items.remove(index);
        } else {
            System.out.println("Помилка: неправильний індекс!");
        }
    }

    /** Виводить усі елементи пакету */
    public void printAll() {
        System.out.println("\nВміст побутового пакету:");
        for (T item : items) {
            item.printInfo();
        }
    }

    /** Знаходить елемент з найбільшою вагою */
    public T findMax() {
        if (items.isEmpty()) return null;
        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
