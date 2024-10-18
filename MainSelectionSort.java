class SelectionSort {
    public void selectionSort(int[] array) {
        int index_of_minimum_element;
        for (int i = 0; i < array.length - 1; i++) {
            index_of_minimum_element = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index_of_minimum_element]) {
                    index_of_minimum_element = j;
                }
            }

            int temp;
            temp = array[i];
            array[i] = array[index_of_minimum_element];
            array[index_of_minimum_element] = temp;

        }
    }
}

public class MainSelectionSort {
    public static void main(String[] args) {

    }
}