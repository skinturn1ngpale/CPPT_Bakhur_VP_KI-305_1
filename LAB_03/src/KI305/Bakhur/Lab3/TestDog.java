package KI305.Bakhur.Lab3;

/**
 * Class TestDog – підклас собаки, який реалізує інтерфейс Experimental
 */
public class TestDog extends Dog implements Experimental {
    private boolean trained;

    /**
     * Конструктор
     * @param name ім'я собаки
     * @param age вік собаки
     * @param weight вага собаки
     */
    public TestDog(String name, int age, double weight) {
        super(name, age, weight);
        this.trained = false;
    }

    /** Реалізація абстрактного методу bark() */
    @Override
    public void bark() {
        System.out.println(name + " гавкає під час експерименту!");
    }

    /** Реакція на команду */
    @Override
    public void testReaction() {
        System.out.println(name + " реагує на команду — сідає та піднімає лапу.");
        trained = true;
    }

    /** Нагорода за виконання команди */
    @Override
    public void reward() {
        if (trained)
            System.out.println(name + " отримує смачний кусочок за гарну поведінку!");
        else
            System.out.println(name + " ще не виконав команду, нагороди немає.");
    }

    /** Вивід розширеної інформації */
    public void fullInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Вага: " + weight + " кг, Навчений: " + trained);
    }
}
