package Tasks.Section_4_Arrays;

public class Arrays {
    public static void Arrays (){
        int[] array = {10, 20, 30, 40, 50};

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        int sum = array[0] + array[array.length / 2];
        System.out.println("Сумма первого и среднего элемента: " + sum);
    }
}
