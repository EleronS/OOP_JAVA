package org.example.calculator;

// Создаем свой класс исключения
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String massage){
        super(massage);
    }
}

// Создаем класс Calculator
public class Calculator {
    public static int divide(int a, int b) throws DivisionByZeroException, InvalidNumberException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        if (a < 0 || b < 0) {
            throw new InvalidNumberException("Неккоректное число");
        }
        /*else if (a > 0 || b > 0) {
            throw new InvalidNumberException("Число коректно");
        }*/
        return a / b;
    }

    public static void main(String[] args) {

        int num2 = 0;
        int num1 = 0;
        try {
            num1 = -10;
            num2 = 2;
            int result = divide(num1, num2);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Числа " + num1 + " и " + num2 + ":");
        } catch (InvalidNumberException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}