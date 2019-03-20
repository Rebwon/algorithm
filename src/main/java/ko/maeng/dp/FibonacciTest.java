package ko.maeng.dp;

public class FibonacciTest {
    static int arr[] = new int[100];
    public static void main(String[] args) {
        System.out.println(dp(10));
    }

    public static int dp(int x){
        if(x==1) return 1;
        if(x==2) return 1;
        if(arr[x] != 0) return arr[x];
        return arr[x] = dp(x-1) + dp(x-2);
    }
}
