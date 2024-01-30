import java.util.Scanner;

public class MatrixOperation {
    public static void MatrixOp() {
        Scanner scanner = new Scanner(System.in);

        // Ввод пользователем размерности матрицы
        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        // Создание матрицы и ввод данных с клавиатуры
        double[][] matrix = new double[rows][cols];
        System.out.println("Введите элементы матрицы:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        // Вывод первой строки матрицы, где каждый элемент умножается на 3
        System.out.println("Первая строка матрицы, умноженная на 3:");

        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] * 3 + " ");
        }
    }
}
