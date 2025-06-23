public class CountOccurances {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 2, 3, 5, 6, 5};
        int target = 5;
        int count = totalTargetCount(arr, target);
        System.out.println("Total Count is " + count);
    }

    public static int totalTargetCount (int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(target == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
