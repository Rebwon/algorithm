package ko.maeng.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int i, j, temp;
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (i = 0; i < 9; i++) {
            j = i;
            while (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }


        for (i = 0; i < 10; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
