package ko.maeng.recursion;

public class Code01 {
    public static void main(String[] args) {
        int n = 4;
        func(n);
    }

    public static void func(int k) {
        if (k <= 0)    //Base case : 적어도 하나의 Recursion에 빠지지 않는 경우가 존재해야함.
            return;
        else {
            System.out.println("Recursion");
            func(k - 1);  //Recursive case : recursion을 반복하다보면 결국 Base case로 수렴해야함.
        }
    }
}
