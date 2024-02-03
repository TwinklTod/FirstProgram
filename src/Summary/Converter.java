package Summary;

import java.util.Scanner;

public class Converter {
    public static void conv() {
        Scanner scanner = new Scanner(System.in);

        // Ввод текущего курса и количество рублей
        System.out.print("Введите текущий курс доллара: ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("Введите количество рублей: ");
        double rublesAmount = scanner.nextDouble();

        // Расчет конвертации и округление до двух знаков после запятой
        double dollarsAmount = rublesAmount / exchangeRate;
        dollarsAmount = Math.round(dollarsAmount * 100.0) / 100.0;

        // Вывод результата
        System.out.println("Итого: " + dollarsAmount + " долларов");

    }
}
