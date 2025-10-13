package KI305.Bakhur.Lab4;

/**
 * Клас CalcException — власне виключення для обробки помилок обчислення
 */
public class CalcException extends Exception {
    /** Унікальний ідентифікатор серіалізації */
    private static final long serialVersionUID = 1L;

    /**
     * Конструктор з повідомленням
     * @param message опис помилки
     */
    public CalcException(String message) {
        super(message);
    }
}
