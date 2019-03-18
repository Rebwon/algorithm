package ko.maeng.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int i, j, temp;
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (i = 0; i < 10; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

}
