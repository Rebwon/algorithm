package ko.maeng.recursion;

public class Code02 {
    public static void main(String[] args) {
        int result = func(4);
        System.out.println(result);
        System.out.println(power(2, 10));
        System.out.println(fibonacci(5));
        System.out.println(gcd(12, 10));
        System.out.println(gcd2(15, 10));
    }

    public static int func(int n) {
        //이 함수는 0~n까지의 합을 구하는 것.
        if (n <= 0)    //n=0이라면 합은 0이다.
            return 0;
        else {
            //n이 0보다 크다면 0에서 n까지의 합은 0에서 n-1까지의 합에 n을 더한 것이다.
            return n + func(n - 1);
        }
    }

    public static double power(double x, int n) {
        //x의 n승 구하는법
        if (n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }

    public static int fibonacci(int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int gcd(int m, int n) {
        //Euclid Method
        if (m < n) {
            //m이 n보다 작을 경우 수를 바꿈
            int tmp = m;
            m = n;
            n = tmp;  //swap m and n
        }
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }

    }

    public static int gcd2(int m, int n) {
        if (n == 0)
            return m;
        else
            return gcd(n, m % n);
    }
}
