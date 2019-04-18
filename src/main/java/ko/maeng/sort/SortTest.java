package ko.maeng.sort;

public class SortTest {
    static int num = 10;
    static int[] arr = {3,2,1,8,5,9,6,10,7,4};

    public static void main(String[] args) {
        //int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        quickSort(arr, 0, num-1);

    }

    public static void quickSort(int[] arr, int start, int end){
        if(start>=end) return;

        int left = start;
        int right = end;
        int pivot = arr[(left+right)/2];
        int temp;

        do{
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;

            if(left<=right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }while(left<=right);

        if(start<end) quickSort(arr, start, right);
        if(end>left) quickSort(arr, left, end);
    }
}
