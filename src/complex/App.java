package complex;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        testQuickSort();

    }

    public static void testMergeSort() {
        Random rand = new Random();
        int[] numbers = new int[10];

        MergeSort sort = new MergeSort();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before: ");
        printArray(numbers);

        sort.mergeSort(numbers);

        System.out.println("After: ");
        printArray(numbers);
    }

    public static void testQuickSort() {
        Random rand = new Random();
        int[] numbers = new int[10];

        QuickSort sort = new QuickSort();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        System.out.println("Before: ");
        printArray(numbers);

        sort.quickSort(numbers);

        System.out.println("After: ");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
}
