package KI305.Bakhur.Lab6;

/**
 * Клас PackageApp — головний клас програми
 * Демонструє роботу з параметризованим класом HouseholdPackage
 */
public class PackageApp {
    public static void main(String[] args) {
        HouseholdPackage<Item> pack = new HouseholdPackage<>();

        pack.addItem(new FoodItem("Хліб", 500, 1200));
        pack.addItem(new FoodItem("Сир", 300, 900));
        pack.addItem(new Appliance("Пилосос", 4.5, 1200));
        pack.addItem(new Appliance("Фен", 0.7, 800));

        pack.printAll();

        Item heaviest = pack.findMax();
        System.out.println("\nНайважчий предмет у пакеті:");
        heaviest.printInfo();

        pack.removeItem(1);
        pack.printAll();

        System.out.println("\nРоботу програми завершено.");
    }
}
