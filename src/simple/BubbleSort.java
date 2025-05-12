package simple;

public class BubbleSort<T extends Comparable<T>> {

    /*
     * Bubble Sort: simple sorting algorithm that works by repeatedly swapping the
     * adjacent elements if they are in the wrong order, comparinig if the value of
     * the current element is higher than the next one.
     * 
     * 1 -> The maximum element goes to the end (its correct position). Same way to
     * the second largest, but going to the current end position - 1.
     * 2 -> In every pass, we process only those elements that have already not
     * moved to the right position. After k passes, the largest k elements must have
     * been moved to the last k positions.
     * 3 -> In each pass, we consider remaining elements (those who aren't in placed
     * in the "last" position) and compare all adjacent and swap if largerst element
     * is before a smaller element. By doing this repeatedly, we get the largest
     * (among the remaining elements) at its correct position.
     */

    public void sort(T[] array) {

        int length = array.length;
        boolean swapped;

        // Iterate through the array
        for (int i = 0; i < length - 1; i++) {
            // Before start to changing those fellas, we assume that no swap was made
            swapped = false;

            // for to move the largest array to its right position
            for (int j = 0; j < length - i - 1; j++) {

                // compareTo method
                // 0 -> Equals
                // 1 -> First element higher than the second
                // -1 -> First element smaller than the second
                int compare = array[j].compareTo(array[j + 1]);

                // If the current element is higher than the adjacent
                if (compare > 0) {

                    // Change its places
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // If the verification says that an element is smaller
                    // than the adjacent, we save an swap state
                    swapped = true;

                }
            }
            // If there are no swaps, we break the loop, saving time...
            if (swapped == false) {
                break;
            }
        }
    }

    public void intSort(Integer[] array) {

        // Definição da variável de tamanho
        int length = array.length;
        // Estado de troca
        boolean swapped;

        // Varrer todo o vetor
        for (int i = 0; i < length - 1; i++) {
            swapped = false;

            // Varre o array até colocar o array maior na última posição
            for (int j = 0; j < length - i - 1; j++) {

                // Se array atual for maior que o seguinte
                if (array[j] > array[j + 1]) {

                    // Troca
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;

                }
            }

            if (swapped == false) {
                break;
            }
        }
    }

    public void printArray(T[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

}
