package Tasks.Section_7_Cycles;

import java.util.Scanner;

public class AverageMultiply {
    public static void AvgMult() {

        Scanner scanner = new Scanner(System.in);

        // Шаг 1: Ввод пользователем размера массива и данных
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        double[] array = new double[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Шаг 2: Вычисление среднего арифметического элементов массива
        double average = calculateAverage(array);

        // Шаг 3: Вывод массива, где каждый элемент умножается на среднее арифметическое
        System.out.println("Массив, умноженный на среднее арифметическое:");
        for (int i = 0; i < size; i++) {
            array[i] *= average;
            System.out.print(array[i] + " ");
        }
    }

    // Метод для вычисления среднего арифметического элементов массива
    private static double calculateAverage(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        if (array.length != 0) {
            return sum / array.length;
        } else {
            return 0; // Защита от деления на ноль, если массив пуст
        }
    }
}
