package Summary;

import java.util.Scanner;

public class EquationSolve {
    public static void equation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();

        char operator = equation.charAt(1);
        int xPosition = equation.indexOf('x');
        int num1, num2,result = 0;

        if (xPosition == 0) {
            num1 = Character.getNumericValue(equation.charAt(2));
            num2 = Character.getNumericValue(equation.charAt(4));
            switch (operator) {
                case '+':
                    result = num2 - num1;
                    break;
                case '-':
                    result = num2 + num1;
                    break;
                default:
                    System.out.println("Неверный оператор");
                    break;
            }
        } else if (xPosition == 2) {
            num1 = Character.getNumericValue(equation.charAt(0));
            num2 = Character.getNumericValue(equation.charAt(4));
            switch (operator) {
                case '+':
                    result = num2 - num1;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                default:
                    System.out.println("Неверный оператор");
                    break;
            }
        } else if (xPosition == 4) {
            num1 = Character.getNumericValue(equation.charAt(0));
            num2 = Character.getNumericValue(equation.charAt(2));
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                default:
                    System.out.println("Неверный оператор");
                    break;
            }
        }
        System.out.println("Решение уравнения: x = " + result);
    }
}
