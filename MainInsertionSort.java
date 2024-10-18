class InsertionSort {
    public void insertionSort(int[] a) {
        int i;
        int j;
        int temp;

        for (i = 1; i < a.length; i++) {
            temp = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
    }

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

public class MainInsertionSort {
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2, 1 };
        InsertionSort i = new InsertionSort();
        i.insertionSort(array);
        i.printArray(array);
    }
}