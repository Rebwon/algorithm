package ko.maeng.recursion;

public class Code04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(search(arr, 7, 6));
        System.out.println(search2(arr, 0, 7, 7));
        System.out.println(findMax(arr, 0, 7));
    }

    //순차 탐색 알고리즘
    //이 함수의 미션은 data[0]에서 data[n-1] 사이에서 target을 검색하는 것이다.
    //하지만 검색 구간의 시작 인덱스 0은 보통 생략한다. 즉 암시적 매개변수이다.
    public static int search(int[] data, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (data[i] == target)
                return i;
        }
        return -1;
    }

    public static int search2(int[] data, int begin, int end, int target) {
        if (begin > end)
            return -1;
        else if (target == data[begin])
            return begin;
        else
            return search2(data, begin + 1, end, target);
    }

    //이 함수의 미션은 data[begin]에서 data[end] 사이에 최대값을 찾아 반환. begin<=end라고 가정.
    public static int findMax(int[] data, int begin, int end) {
        if (begin == end)
            return data[begin];
        else {
            return Math.max(data[begin], findMax(data, begin + 1, end));
        }
    }

    //이진 검색 items[begin]에서 items[end] 사이에서 target을 검색한다.
    public static int binarySearch(String[] items, String target, int begin, int end) {
        if (begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0) {
                return middle;
            } else if (compResult < 0) {
                return binarySearch(items, target, begin, middle - 1);
            } else {
                return binarySearch(items, target, middle + 1, end);
            }
        }
    }
}
