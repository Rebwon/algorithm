package ko.maeng.bigO;

public class BigOTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10,11};
        //여러 부분으로 나뉘어진 알고리즘: 덧셈 vs 곱셈

        //아래에 알고리즘은 한 알고리즘을 수행후 그 다음 알고리즘을 수행하기 때문에 O(A+B)이다.
        for(int a : arr){
            System.out.println(a);
        }
        for(int b : arr){
            System.out.println(b);
        }

        //아래에 알고리즘은 a의 각 원소에 대해 b의 일을 수행한다. 그러므로 O(A*B)이다.
        for(int a : arr){
            for(int b : arr2){
                System.out.println(a + ", " + b);
            }
        }
    }


}
