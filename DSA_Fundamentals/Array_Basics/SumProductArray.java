import java.util.Arrays;

public class SumProductArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        calculateSumAndProduct(arr);
    }

    public static void calculateSumAndProduct (int[] arr) {
        int sum = 0; 
        int product = 1;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            product = product * arr[i];
        }

        System.out.println("The sum of " + Arrays.toString(arr) + " is " + sum);
        System.out.println("The product of " + Arrays.toString(arr) + " is " + product);
    }
}