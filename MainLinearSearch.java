class LinearSearch {
    public void LinearSearchMethod(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println(key + " found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");

    }
}

public class MainLinearSearch {
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2, 1 };
        LinearSearch ls = new LinearSearch();
        ls.LinearSearchMethod(array, 1);

    }
}