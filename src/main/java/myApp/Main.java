package myApp;

public class Main {
    public static void main(String[] args) {
        int count = 20;
        int[] array = Sorter.getNumbers(count);

        System.out.println("Hello World!");
        System.out.println("Let's sort this array of numbers");

        Sorter.printArray(array);

        System.out.println("Sorting in progress...");

        Sorter.quickSort(array, 0, array.length - 1);

        System.out.println("Sorting finished");

        Sorter.printArray(array);
    }

}
