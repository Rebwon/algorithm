package ko.maeng.test;

public class ArrayTwo {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        /*for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }*/

        for (int i = 0; i < arr.length * arr[0].length; i++) {
            int row = i / arr[0].length;      //행
            int column = i % arr[0].length;   //열
            System.out.print(arr[row][column] + "\t");

            if (column == arr[0].length - 1) {
                System.out.println();
            }
        }
    }
}
