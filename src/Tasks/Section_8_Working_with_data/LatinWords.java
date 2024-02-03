package Tasks.Section_8_Working_with_data;

import java.util.Scanner;

public class LatinWords {
    public static void LatWord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку из слов, разделенных пробелами: ");
        String inputString = scanner.nextLine();

        System.out.println("Слова из латинских символов:");

        String[] words = inputString.split("\\s+");
        int latinWordsCount = 0;

        for (String word : words) {
            if (isLatin(word)) {
                System.out.println(word);
                latinWordsCount++;
            }
        }

        System.out.println("Количество слов из латинских символов: " + latinWordsCount);
    }
    private static boolean isLatin(String word) {
        return word.matches("[a-zA-Z]+");
    }
}
