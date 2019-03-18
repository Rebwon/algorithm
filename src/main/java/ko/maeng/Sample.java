package ko.maeng;

public class Sample {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};

        System.out.println(sample(data, 4));
        System.out.println(sum(data, 5));
        System.out.println(search(4, data, 3));
        System.out.println(is_distinct(1, data));

        int n = 16; //입력값 n이 16일 때
        /*O (1) = 1 step -- O(1)는 시간복잡도가 1입니다.
          O (log n) = -- O(log n)는 시간복잡도가 4입니다. (log 의 밑이 2라고 가정)
          O (n) = 16 steps -- O(n)는 시간복잡도가 16
          O(n^2) = 256 steps -- O(n^2)는 시간복잡도가 256
          O(2^n) = 65,536 steps*/

    }

    public static int sample(int[] data, int n) {
        int k = n / 2;
        return data[k];
    }

    public static int sum(int[] data, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum += data[i];
        }
        return sum;
    }

    public static int search(int n, int[] data, int target) {
        for (int i = 0; i < n; i++) {
            if (data[i] == target)
                return i;
        }
        return -1;
    }

    public static boolean is_distinct(int n, int[] data) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i] == data[j])
                    return false;
            }
        }
        return true;
    }

}
