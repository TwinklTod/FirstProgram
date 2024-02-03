package Tasks.Section_7_Cycles;

import java.util.Scanner;

public class ArrayConstants {
    public static void ArrCons() {
        Scanner scanner = new Scanner(System.in);

        // Шаг 1: Ввод размера массива и данных с клавиатуры
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Шаг 2: Сравнение элементов массива с константами
        int x = 10;
        int y = 20;
        int z = 30;

        // Шаг 3: Вывод сообщения, если хотя бы одна из констант содержится в массиве
        if (containsConstant(array, x) || containsConstant(array, y) || containsConstant(array, z)) {
            System.out.println("Значение имеется в константах.");
        } else {
            System.out.println("Ни одной из констант в массиве не найдено.");
        }
    }
    // Метод для проверки, содержится ли значение в массиве
    private static boolean containsConstant(int[] array, int constant) {
        for (int value : array) {
            if (value == constant) {
                return true;
            }
        }
        return false;
    }
}
