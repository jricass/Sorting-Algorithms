package complex;

import java.util.Random;

public class QuickSort {

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    private static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rigthPointer = highIndex;

        while (leftPointer < rigthPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rigthPointer) {
                leftPointer++;
            }

            while (array[rigthPointer] >= pivot && leftPointer < rigthPointer) {
                rigthPointer--;
            }

            swap(array, leftPointer, rigthPointer);
        }

        swap(array, leftPointer, highIndex);
        return leftPointer;
    }
}
