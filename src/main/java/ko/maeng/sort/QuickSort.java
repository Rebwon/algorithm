package ko.maeng.sort;

public class QuickSort {
    static int num = 10;
    static int[] arr = {3,2,1,8,5,9,6,10,7,4};

    public static void main(String[] args) {
        /*quickSort(arr, 0, num - 1);
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", arr[i]);
        }*/

        quickSort2(arr, 0, num-1);
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void quickSort2(int[] arr, int start, int end){
        if(start>=end) return;  //원소가 1개인 경우

        int left = start;       //왼쪽 부분집합
        int right = end;        //오른쪽 부분집합
        int pivot = arr[(left+right)/2];    //배열의 중간 원소 값을 기준값으로 지정
        int temp;               //스위칭변수

        do{
            while(arr[left] < pivot) left++;
            while(arr[right] > pivot) right--;

            if(left <= right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                //System.out.println(Arrays.toString(arr));
                left++;
                right--;
            }
        } while(left <= right);

        if(start<end) quickSort2(arr, start, right);    //기준값의 왼쪽 부분집합에 대해 퀵 정렬 재귀호출
        if(end>left) quickSort2(arr, left, end);        //기준값의 오른쪽 부분집합에 대해 퀵 정렬 재귀호출
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) { //원소가 1개인 경우
            return;
        }

        int key = start;    //키는 첫번째 원소(피벗값)
        int i = start + 1;  //키값의 다음 인덱스 값
        int j = end;        //마지막 원소 값
        int temp;

        //내림차순으로 변경하려면 인덱스 값이 바뀌는 두 부분을 변경해주어야 한다.
        while (i <= j) {    //엇갈릴 때까지 반복
            while (i <= end && arr[i] <= arr[key]) {  //키 값보다 큰 값
                i++;    //인덱스 값 증가
            }
            while (arr[j] >= arr[key] && j > start) { //키 값보다 작은 값을 만날때
                j--;    //인덱스 값 감소
            }
            if (i > j) {  //현재 엇갈린 상태면 키 값과 교체
                temp = arr[j];
                arr[j] = arr[key];
                arr[key] = temp;
            } else {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        quickSort(arr, start, j - 1);    //기준값의 왼쪽 부분집합에 대해 퀵 정렬 재귀호출
        quickSort(arr, j + 1, end);     //기준값의 오른쪽 부분집합에 대해 퀵 정렬 재귀호출
    }
}
