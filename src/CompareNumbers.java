import java.util.Scanner;

public class CompareNumbers {
    public static void CompNum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        String strNum = scanner.nextLine();

        System.out.println("Введите второе число: ");
        int intNum = scanner.nextInt();

        int toIntNum = Integer.parseInt(strNum);
        int maxNum = Math.max(intNum, toIntNum);
        System.out.println("Большее число: " + maxNum);

        double minNum = Math.min(intNum, toIntNum);
        System.out.println("Меньшее число " + minNum);
    }
}
