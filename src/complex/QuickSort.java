package complex;

import java.util.Random;

public class QuickSort { // Pivot ordering

    /*
     * Divide and Conquer based. Picks an element as a pivot and partitions the
     * given array around the picked pivot by placing the pivot in its correct
     * position in the sorted array.
     * 
     * 1 -> Choose a Pivot - Select an element from the array as the pivot. The
     * choice of pivoto can vary (first element, last, random or median)
     * 2 -> Partition the Array - Rearrange the array around the pivot. After
     * partitioning, all elements smaller tan the pivot whill be on its left, and
     * all elements greater will be on its right. The pivot is then in its correct
     * position.
     * 3 -> Recursively Call - Recursively apply the same process to the two
     * partitioned sub-arrays (left and right of the pivot).
     * 4 -> Base case - The recursion stops when there is only one element left in
     * the sub-array, as a single element is already sorted (lowIndex >= highIndex).
     */

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int lowIndex, int highIndex) {

        // Stop condition of the recursion
        // That means we have an sub-array with one element
        if (lowIndex >= highIndex) {
            return;
        }

        // Random pivot
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        // Recursive quicksort for the left sub-array partition
        quickSort(array, lowIndex, leftPointer - 1);
        // Recursive quicksort for the right sub-array partition
        quickSort(array, leftPointer + 1, highIndex);
    }

    private static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        // Pointers that will be used as reference to an specific element of the
        // array, wich will be compared with the pivot element.
        // Will compare if the array[leftPointer] is higher than the pivot
        int leftPointer = lowIndex;
        // Will compare if the array[rightPointer] is less than the pivot
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            // Will compare if the element at the leftPointer is LOWER than the pivot
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                // If it is NOT, we move to the next to see if it is
                leftPointer++;
            }

            // Will compare if the element at the rightPointer is HIGHER than the pivot
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                // If it is NOT, we move to the next to see if it its
                rightPointer--; // But we're going to the right so '--'
            }

            // As soon as the element in the leftPointer is > pivot and the
            // element in the rightPointer is < pivot we swap thos elements
            swap(array, leftPointer, rightPointer);
        }

        // When the lefPointer and the rightPointer share the same spot, we
        // swap the leftPointer with the highIndex, wich we know is the pivot
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }
}
