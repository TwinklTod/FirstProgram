import java.util.Random;
import java.util.Arrays;

public class RandomArray {
    public static void RndArr() {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        System.out.println("Массив: " + Arrays.toString(array));

        int maxElement = array[0];
        int minElement = array[0];

        for (int value : array) {
            maxElement = Math.max(maxElement, value);
            minElement = Math.min(minElement, value);
        }

        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Минимальный элемент: " + minElement);

        int maxAbsValue = Math.max(Math.abs(maxElement), Math.abs(minElement));
        System.out.println("Наибольшее по модулю: " + maxAbsValue);
    }
}