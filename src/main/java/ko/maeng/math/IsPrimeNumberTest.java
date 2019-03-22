package ko.maeng.math;

public class IsPrimeNumberTest {
    static int number = 100000;
    static int[] arr = new int[100001];

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(97));
        System.out.println(isPrimeNum(97));
        primeNumberSieve();
    }

    public static void primeNumberSieve(){
        for(int i=2; i<=number; i++){
            arr[i] = i;
        }
        for(int i=2; i<=number; i++){
            if(arr[i] == 0) continue;
            for(int j=i+i; j<=number; j+=i){
                arr[j] = 0;
            }
        }
        for(int i=2; i<=number; i++){
            if(arr[i] != 0) System.out.printf("%d ", arr[i]);
        }
    }

    //O(N)
    public static boolean isPrimeNumber(int n){
        for(int i=2; i<n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    //O(N^(1/2))
    public static boolean isPrimeNum(int n){
        int end = (int) Math.sqrt(n);
        for(int i=2; i<=end; i++){
            if(n % i ==0) return false;
        }
        return true;
    }
}
