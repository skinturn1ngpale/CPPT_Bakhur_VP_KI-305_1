##################################################################################
# Copyright (c) 2025 Lviv Polytechnic National University.
# Laboratory work №8. Variant 3 (Modified for degrees).
# Task: Compute y = sin(x)/cos(x) for x in DEGREES with file read/write and exceptions.
##################################################################################

import math
import os
import struct
import sys


def calculate(x_deg):
    """Обчислення функції y = sin(x)/cos(x), де x — у градусах"""
    try:
        # Переведення градусів у радіани
        x_rad = math.radians(x_deg)
        result = math.sin(x_rad) / math.cos(x_rad)
    except ZeroDivisionError:
        print("Помилка: ділення на нуль (cos(x) = 0)")
        result = None
    return result


def write_text(filename, result):
    """Запис результату у текстовий файл"""
    with open(filename, 'w', encoding='utf-8') as f:
        f.write(str(result))


def read_text(filename):
    """Зчитування результату з текстового файлу"""
    try:
        if os.path.exists(filename):
            with open(filename, 'r', encoding='utf-8') as f:
                return f.read()
        else:
            raise FileNotFoundError(f"Файл {filename} не знайдено.")
    except FileNotFoundError as e:
        print(e)
        return None


def write_binary(filename, result):
    """Запис результату у двійковий файл"""
    with open(filename, 'wb') as f:
        f.write(struct.pack('f', result))


def read_binary(filename):
    """Зчитування результату з двійкового файлу"""
    try:
        if os.path.exists(filename):
            with open(filename, 'rb') as f:
                return struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"Файл {filename} не знайдено.")
    except FileNotFoundError as e:
        print(e)
        return None


if __name__ == "__main__":
    try:
        x = float(input("Введіть значення x (у градусах): "))
        result = calculate(x)
        if result is not None:
            print(f"Результат: y = {result:.4f}")

            write_text("result.txt", result)
            write_binary("result.bin", result)

            print(f"Зчитано з текстового файлу: {read_text('result.txt')}")
            print(f"Зчитано з двійкового файлу: {read_binary('result.bin')}")
    except ValueError:
        print("Помилка: введено нечислове значення.")
        sys.exit(1)
