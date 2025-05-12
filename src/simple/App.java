package simple;

public class App {
    public static void main(String[] args) {

        testInsertionSort();

    }

    public static void testSelectionSort() {

        Integer[] array = { 4, 2, 12, 43, 3, 6, 9, 12, 7, 15, 10, 21 };

        SelectionSort<Integer> sort = new SelectionSort<>();

        sort.printArray(array);
        sort.sort(array);
        sort.printArray(array);
    }

    public static void testBubbleSort() {

        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }

        BubbleSort<Integer> sort = new BubbleSort<>();

        sort.printArray(array);
        sort.sort(array);
        sort.printArray(array);
    }

    public static void testInsertionSort() {

        Integer[] array = { 4, 2, 12, 43, 3, 6, 9, 12, 7, 15, 10, 21 };
        String[] arrayStrings = { "Silas", "Alberto", "Bernardo", "João", "Otavio", "Renan", "Carlos" };

        InsertionSort<Integer> sort = new InsertionSort<>();
        InsertionSort<String> stringSort = new InsertionSort<>();

        stringSort.printArray(arrayStrings);
        stringSort.sort(arrayStrings);
        stringSort.printArray(arrayStrings);

        // sort.printArray(array);
        sort.sort(array);
        // sort.printArray(array);
    }

}
