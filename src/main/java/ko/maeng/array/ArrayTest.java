package ko.maeng.array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String[] arr = {"b","d","a","c"};
        Arrays.sort(arr);   //문자는 사전순 숫자는 작은 값부터
        for(String s : arr){
            System.out.print(s + " ");
        }

        System.out.println();

        int[] ia = {4,1,5,3,2,7};
        Arrays.sort(ia);
        for(int i : ia){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("5가 있는지 " + Arrays.binarySearch(ia, 5)); //이진검색으로 정렬되어있는 배열에서 5의 위치 값을 반환
    }
}
