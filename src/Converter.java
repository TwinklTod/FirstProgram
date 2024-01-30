import java.util.Scanner;

public class Converter {
    public static void Conv() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertMass();
                break;
            case 2:
                convertDistance();
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
    }

    private static void convertMass() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите единицу измерения: 1 - кг, 2 - фунт, 3 - унция");
        int unit = scanner.nextInt();

        System.out.println("Введите количество выбранных единиц:");
        double amount = scanner.nextDouble();

        switch (unit) {
            case 1:
                System.out.println("Результат:");
                System.out.println("Килограммы: " + amount);
                System.out.println("Фунты: " + (amount * 2.20462));
                System.out.println("Унции: " + (amount * 35.274));
                break;
            case 2:
                System.out.println("Результат:");
                System.out.println("Килограммы: " + (amount / 2.20462));
                System.out.println("Фунты: " + amount);
                System.out.println("Унции: " + (amount * 16));
                break;
            case 3:
                System.out.println("Результат:");
                System.out.println("Килограммы: " + (amount / 35.274));
                System.out.println("Фунты: " + (amount / 16));
                System.out.println("Унции: " + amount);
                break;
            default:
                System.out.println("Некорректный выбор.");
        }
    }

    private static void convertDistance() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int unit = scanner.nextInt();

        System.out.println("Введите количество выбранных единиц:");
        double amount = scanner.nextDouble();

        switch (unit) {
            case 1:
                System.out.println("Результат:");
                System.out.println("Метры: " + amount);
                System.out.println("Мили: " + (amount * 0.000621371));
                System.out.println("Ярды: " + (amount * 1.09361));
                System.out.println("Футы: " + (amount * 3.28084));
                break;
            case 2:
                System.out.println("Результат:");
                System.out.println("Метры: " + (amount / 0.000621371));
                System.out.println("Мили: " + amount);
                System.out.println("Ярды: " + (amount * 1760));
                System.out.println("Футы: " + (amount * 5280));
                break;
            case 3:
                System.out.println("Результат:");
                System.out.println("Метры: " + (amount / 1.09361));
                System.out.println("Мили: " + (amount / 1760));
                System.out.println("Ярды: " + amount);
                System.out.println("Футы: " + (amount * 3));
                break;
            case 4:
                System.out.println("Результат:");
                System.out.println("Метры: " + (amount / 3.28084));
                System.out.println("Мили: " + (amount / 5280));
                System.out.println("Ярды: " + (amount / 3));
                System.out.println("Футы: " + amount);
                break;
            default:
                System.out.println("Некорректный выбор.");
        }

    }
}

