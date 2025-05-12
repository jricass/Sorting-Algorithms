package simple;

public class InsertionSort<T extends Comparable<T>> {

    /*
     * Insertion Sort: works by inserting each element of an unsorted list into its
     * correct position.
     * 
     * 1 -> We start with the second element of the array as the first element is
     * assumed to be sorted.
     * 2 -> Compare the second element with the first element if the second element
     * is smaller then swap them.
     * 3 -> Move to the third element, compare it with the first two elements, and
     * put it in its correct position.
     * 4 -> Repeat until the entire array is sorted.
     */

    public void sort(T[] array) {

        int length = array.length;

        for (int i = 1; i < length; i++) {
            T key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {

                array[j + 1] = array[j];
                j--;

            }
            array[j + 1] = key;
        }
    }

    public void intSort(Integer[] array) {

        int length = array.length;

        // Começa a iteração do segundo elemento. O primeiro ja se considera "Ordenado".
        for (int i = 1; i < length; i++) {
            // Armazena o valor atual que será inserido na parte ordenada.
            int key = array[i];
            // Index do elemento anterior a posição atual.
            int j = i - 1;

            // Move elementos maiores que key uma posição à frente.
            // assim que encontra a posição certa, insere a 'key'.
            while (j >= 0 && array[j] > key) {

                array[j + 1] = array[j]; // Desloca elemento pra direita.
                j--; // Passa para o elemento anterior.

            }
            array[j + 1] = key; // Insere a key na posição correta (logo após o ultimo elemento menor ou igual).
        }
    }

    public void sortOptimized(T[] array) {
        int length = array.length;
        boolean sorted = true;

        for (int i = 1; i < length; i++) {
            T key = array[i];
            int j = i - 1;

            if (array[j].compareTo(key) > 0) {
                sorted = false; // Algo está fora de ordem
            }

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }

        if (sorted) {
            System.out.println("O array já estava ordenado!");
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
