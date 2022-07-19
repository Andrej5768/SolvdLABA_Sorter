package MyApp;


import java.util.Arrays;

public class Sorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    public static int[] getNumbers(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            int a = (int) (Math.random() * 100);
            array[i] = a;
        }
        return array;
    }

    public static void printArray (int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void sorterShell(int[] array) {
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}