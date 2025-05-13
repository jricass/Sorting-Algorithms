package complex;

public class MergeSort { // Target -> One element array

    /*
     * Merge sort follows the divide-and-conquer approach. It works
     * by recursively dividing the input array into two halves, recursively
     * sorting the two halves and finally merging them back together to obtain
     * the sortef array.
     * 
     * 1 -> Divide: Divide the list or array recursively into two halves until
     * it can no more be divided (inputLength < 2).
     * 2 -> Conquer: Each subarray is sorted individually using the merge sort
     * algorithm.
     * 3 -> Merge: The sorted subarrays are merged back together in sorted
     * order. The process continues until all elements from both subarrays have
     * been merged.
     */

    public void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        // Stop condition of the method, if the array has 1 or 0 elements.
        if (inputLength < 2) {
            return;
        }

        // Finding the mid index of the array
        int midIndex = inputLength / 2;
        // Left side will have the size of the mid index
        int[] leftHalf = new int[midIndex];
        // Rigth side will have the size of the original array - the mid index
        // Have to be like this because of the possibility of an odd array
        int[] rigthHalf = new int[inputLength - midIndex];

        // Fill the leftHalf
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        // Fill the rightHalf
        for (int i = midIndex; i < inputLength; i++) {
            rigthHalf[i - midIndex] = inputArray[i];
        }

        // Recursively call the method for the both halves unil we have 1 element array
        mergeSort(leftHalf);
        mergeSort(rigthHalf);

        // Sort the array parts in the inputArray
        merge(inputArray, leftHalf, rigthHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rigthHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rigthHalf.length;

        // Iterators
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rigthHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rigthHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rigthHalf[j];
            j++;
            k++;
        }
    }

}
