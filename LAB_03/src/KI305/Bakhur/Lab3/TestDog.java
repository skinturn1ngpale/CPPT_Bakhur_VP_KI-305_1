package KI305.Bakhur.Lab3;

/**
 * Class TestDog – підклас собаки, який реалізує інтерфейс Experimental
 */
public class TestDog extends Dog implements Experimental {
    private boolean trained;

    public TestDog(String name, int age, double weight) {
        super(name, age, weight);
        this.trained = false;
    }

    @Override
    public void bark() {
        System.out.println(getName() + " гавкає під час експерименту!");
    }

    @Override
    public void testReaction() {
        System.out.println(getName() + " реагує на команду — сідає та піднімає лапу.");
        trained = true;
    }

    @Override
    public void reward() {
        if (trained)
            System.out.println(getName() + " отримує смачний кусочок за гарну поведінку!");
        else
            System.out.println(getName() + " ще не виконав команду, нагороди немає.");
    }

    public void fullInfo() {
        System.out.println("Ім'я: " + getName() +
                ", Вік: " + getAge() +
                ", Вага: " + getWeight() +
                " кг, Навчений: " + trained);
    }
}
