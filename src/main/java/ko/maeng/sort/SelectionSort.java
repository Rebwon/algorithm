package ko.maeng.sort;

public class SelectionSort {
    //선택 정렬 알고리즘
    //선택 정렬의 시간복잡도 O(n^2)
    //처리할 데이터가 많을 경우, 효율적인 알고리즘이 아님
    //다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하시오.
    //1 10 5 8 7 6 4 3 9 2
    public static void main(String[] args) {
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 9, 2};

        int i, j;    //반복문을 돌며 배열의 원소 탐색을 위한 변수
        int min;    //최솟값 변수
        int index = 0;  //가장 작은 원소의 인덱스 위치를 담는 변수
        int temp;       //특정한 두 숫자의 위치를 바꾸기 위한 변수

        for (i = 0; i < array.length; i++) {
            min = 9999;
            for (j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for (i = 0; i < 10; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
