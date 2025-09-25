package KI305.Bakhur.Lab2;

import java.io.FileNotFoundException;

/**
 * Class <code>DogApp</code> is driver class for testing Dog abilities
 */
public class DogApp {
    public static void main(String[] args) throws FileNotFoundException {
        Dog dog = new Dog("Бім", 3, 12.5,
                new Breed("Вівчарка"),
                new Collar("синій"),
                new Owner("Андрій"));

        dog.bark();
        dog.eat("кістку");
        dog.walk();
        dog.play();
        dog.sleep();
        dog.birthday();
        dog.putOnCollar("зелений");
        dog.changeOwner(new Owner("Марія"));

        System.out.println(dog.getInfo());

        dog.dispose();
    }
}
