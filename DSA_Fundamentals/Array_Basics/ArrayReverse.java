public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    //Navie Approach - O(n), O(n) - copy the array and again paste into it
    //Two pointer Approach - O(n), O(1)
    //Swapping - Divide the array into n/2 then swap as arr[i] with arr[n - i - 1]
    //Recrussion - O(n), O(n)
    //inbuilt method - Collections.reverse(arr) array should be ArrayList - O(n), O(1)

}
