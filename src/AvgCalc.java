import java.util.Scanner;

public class AvgCalc {
    public static void AvgCalc () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = scanner.nextDouble();

        System.out.println("Введите число y: ");
        double y = scanner.nextDouble();

        System.out.println("Введите число z: ");
        double z = scanner.nextDouble();

        double avg = (x + y + z) / 3;
        System.out.println("Среднее арифметическое чисел:  " + avg);

        double halfAvg = Math.floor(avg / 2);

        if (halfAvg > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
