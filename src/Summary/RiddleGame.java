package Summary;

import java.util.Scanner;

public class RiddleGame {
    public static void riddle() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        boolean hintUsed = false;

        System.out.println("Отгадайте загадку");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        while (attempts > 0) {
            System.out.print("Ответ: ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                return;
            } else if (answer.equalsIgnoreCase("Подсказка")) {
                if (!hintUsed && attempts >= 2) {
                    System.out.println("Подсказка: Это программа, способная нанести вред компьютерной системе.");
                    hintUsed = true;
                } else {
                    System.out.println("Подсказка уже недоступна");
                }
            } else {
                if (attempts == 1) {
                    System.out.println("Обидно, приходи в другой раз");
                    return; // завершаем программу, так как попытки закончились
                } else {
                    System.out.println("Подумай еще!");
                    if (attempts == 3 && !hintUsed) {
                        System.out.println("Может подсказку? \nВведи \"Подсказка\"");
                    }
                    attempts--; // уменьшаем количество оставшихся попыток
                }
            }
        }
    }
}
