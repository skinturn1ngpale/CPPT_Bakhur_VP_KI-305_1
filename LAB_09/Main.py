"""
Головний модуль Main — демонстрація роботи програми
"""

from ExperimentalDog import ExperimentalDog

def main():
    """Основна функція програми"""
    print("=== Лабораторна робота №9 ===")
    print("Варіант 3 — Пес → Піддослідний пес\n")

    # Створення об'єкта піддослідного пса
    dog = ExperimentalDog("Рекс", 4, "Вівчарка", "дослідження поведінки")

    # Виведення базової інформації
    dog.info()
    print()

    # Виклики методів
    dog.bark()
    dog.eat("м'ясо")
    print()

    # Тренування та експеримент
    dog.perform_experiment()
    dog.train()
    dog.perform_experiment()
    print()

    # Фінальна інформація
    dog.info()

if __name__ == "__main__":
    main()
