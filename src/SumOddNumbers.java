import java.util.Scanner;

public class SumOddNumbers {
    public static void SumOdd() {
        Scanner scanner = new Scanner(System.in);

        // Ввод пользователем целого положительного числа n
        System.out.print("Введите целое положительное число n: ");
        int n = scanner.nextInt();

        // Проверка на положительность
        while (n <= 0){
            System.out.println("Введено некорректное значение. Пожалуйста, введите положительное число.");
            System.out.print("Введите целое положительное число n: ");
            n = scanner.nextInt();
            }
        // Вычисление суммы нечетных чисел от 1 до n
        int sum = calculateSumOfOddNumbers(n);

        // Вывод результата
        System.out.println("Сумма нечетных чисел от 1 до " + n + " равна: " + sum);
        }
    // Метод для вычисления суммы нечетных чисел от 1 до n
    private static int calculateSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
