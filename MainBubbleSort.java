class BubbleSort {

    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

public class MainBubbleSort {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] array = { 5, 4, 3, 2, 1 };
        b.bubbleSort(array);

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
