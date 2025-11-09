"""
Модуль ExperimentalDog — піддослідний пес
"""

from Dog import Dog

class ExperimentalDog(Dog):
    """Клас, який наслідує Dog і додає нові властивості піддослідного собаки"""

    def __init__(self, name, age, breed, experiment_type, trained=False):
        """
        Ініціалізація піддослідного пса
        :param experiment_type: тип експерименту (наприклад, "тест пам'яті")
        :param trained: чи пройшов пес тренування
        """
        super().__init__(name, age, breed)
        self.experiment_type = experiment_type
        self.trained = trained

    def train(self):
        """Метод для тренування піддослідного пса"""
        if not self.trained:
            print(f"{self.name} проходить тренування...")
            self.trained = True
            print(f"{self.name} тепер натренований для {self.experiment_type}.")
        else:
            print(f"{self.name} вже натренований.")

    def perform_experiment(self):
        """Метод, що імітує виконання експерименту"""
        if self.trained:
            print(f"{self.name} виконує експеримент: {self.experiment_type}.")
        else:
            print(f"{self.name} ще не готовий до експерименту!")

    def info(self):
        """Перевизначений метод з базового класу"""
        super().info()
        status = "натренований" if self.trained else "не натренований"
        print(f"Тип експерименту: {self.experiment_type}, Стан: {status}")
