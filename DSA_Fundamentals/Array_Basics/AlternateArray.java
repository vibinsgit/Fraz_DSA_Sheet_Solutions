public class AlternateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        alternateArray(arr);
    }

    public static void alternateArray (int[] arr) {
        for(int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }

    //Recursion - O(n), O(n)
}
