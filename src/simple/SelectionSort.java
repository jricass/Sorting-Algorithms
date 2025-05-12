package simple;

public class SelectionSort<T extends Comparable<T>> {

    /*
     * Comparison-based sorting algorithm. Selects the smallest element and swaps it
     * with the first unsorted element
     * 
     * 1. Find the smallest element and swap w the first element, getting the
     * smallest element at its corret position.
     * 2. Find the next smallest element among the remaining elements and swap with
     * the second element.
     * 3. Keep doing this until we get all elements moved to the right position.
     */

    public void sort(T[] array) {

        // Defining the array lenght into a variable
        int lenght = array.length;

        // Iterate through all the array
        for (int i = 0; i < lenght - 1; i++) {

            // Defining the minimum element
            // It will be the "current position"
            int min_index = i;

            for (int j = i + 1; j < lenght; j++) {

                int compare = array[j].compareTo(array[min_index]);

                if (compare < 0) {

                    min_index = j;

                }

            }

            T temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
    }

    public void intSort(int[] array) {

        // Define uma variável que armazena o tamanho do vetor
        int lenght = array.length;

        // Percorrer todo o vetor
        for (int i = 0; i < lenght - 1; i++) {

            // Define um index mínimo
            // Esse será usado como base da comparação
            int min_index = i;

            // Vai varer todos os elementos após I
            for (int j = i + 1; j < lenght; j++) {

                // Se elemento presente na posição J for menor que a BASE
                if (array[j] < array[min_index]) {

                    // Index da base passa a ser J
                    min_index = j;

                }

            }

            // Armazena valor no indice atual em uma variável temporaria
            int temp = array[i];
            // Valor de I passa a ser o valor do min_index
            array[i] = array[min_index];
            // Vaçpr do min_index passa a ser valor na variável temporaria
            array[min_index] = temp;
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
