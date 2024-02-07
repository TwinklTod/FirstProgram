package Summary;

import java.util.Scanner;

public class MaxDistinctChars {
    public static void maxChars() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String maxDistinctCharsString = "";
        int maxDistinctCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Строка " + i + ": ");
            String currentString = scanner.nextLine();

            boolean[] seen = new boolean[Character.MAX_VALUE + 1];;
            int distinctCount = 0;

            for (char ch : currentString.toCharArray()) {
                if (!seen[ch]) {
                    seen[ch] = true;
                    distinctCount++;
                }
            }

            if (distinctCount > maxDistinctCount || (distinctCount == maxDistinctCount && maxDistinctCharsString.isEmpty())) {
                maxDistinctCharsString = currentString;
                maxDistinctCount = distinctCount;
            }
        }

        System.out.println("Ответ: " + maxDistinctCharsString);
    }
}
