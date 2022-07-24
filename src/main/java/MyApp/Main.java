package MyApp;

public class Main {
    public static void main(String[] args) {
        int[] array = Sorter.getNumbers(100);

        System.out.println("Hello World!");
        System.out.println("Let's sort this array of numbers");

        Sorter.printArray(array);

        System.out.println("Sorting in progress...");

        Sorter.quickSort(array, 0, array.length - 1);

        System.out.println("Sorting finished");

        Sorter.printArray(array);
    }

}
