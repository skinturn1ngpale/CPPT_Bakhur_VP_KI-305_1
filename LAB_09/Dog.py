"""
Модуль Dog — базовий клас Пес
"""

class Dog:
    """Клас, який описує звичайного собаку"""

    def __init__(self, name, age, breed):
        """
        Ініціалізація основних властивостей собаки
        :param name: ім'я собаки
        :param age: вік собаки
        :param breed: порода
        """
        self.name = name
        self.age = age
        self.breed = breed

    def bark(self):
        """Метод, що імітує гавкіт собаки"""
        print(f"{self.name} гавкає: Гав-гав!")

    def eat(self, food):
        """Метод, що відображає процес годування"""
        print(f"{self.name} їсть {food}.")

    def info(self):
        """Виведення інформації про собаку"""
        print(f"Ім'я: {self.name}, Вік: {self.age} років, Порода: {self.breed}")
