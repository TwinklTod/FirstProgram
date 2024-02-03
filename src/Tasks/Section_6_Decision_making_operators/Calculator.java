package Tasks.Section_6_Decision_making_operators;

import java.util.Scanner;

public class Calculator {
    public static void Calc() {
        double result = 0;  // Initialize result variable

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите число y: ");
        double y = scanner.nextDouble();

        System.out.println("Выберите операцию: \n Вычитание (-) \n Сложение (+) \n Умножение (*) \n Деление (/)");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                    result = Double.POSITIVE_INFINITY;
                }
                break;
            default:
                System.out.println("Ошибка: неверная операция");
        }
        System.out.println("Результат: " + result);

    }
}