public class ArrayForwardBackward {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5};
        if(checkForwardBackwardNotAll(arr) == 1) {
            System.out.println("Forward");
        } else if (checkForwardBackwardNotAll(arr) == -1) {
            System.out.println("Backword");
        } else {
            System.out.println("Not at all");
        }
    }

    public static int checkForwardBackwardNotAll (int[] arr) {
        int n = arr.length;
        boolean isAscending = true;
        boolean isDescending = true;

        for(int i = 1; i < n; i++) {
            if(arr[i - 1] < arr[i]) {
                isDescending = false;
            } else if (arr[i - 1] > arr[i]) {
                isAscending = false;
            }
        }
        
        if(isAscending) {
            return 1;
        } else if (isDescending) {
            return -1;
        } else {
            return 0;
        }
    }
}
