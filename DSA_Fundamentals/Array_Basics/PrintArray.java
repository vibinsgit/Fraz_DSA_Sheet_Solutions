import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        //O(n) - Time Complexity, O(1) - Space complexity
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } 

        System.out.println();

        //O(n) - Time Complexity, O(n) - Space complexity
        System.out.println(Arrays.toString(arr));

        //Other ways = while loop, forEach loop

        int[][] matrixArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(Arrays.deepToString(matrixArray));
    }
}