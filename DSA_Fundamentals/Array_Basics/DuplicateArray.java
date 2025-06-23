public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] b = new int[arr.length];


        //for loop with b[i] = a[i]; then b[0]++ - to differ

        //b[] = arr.clone(), b[0]++

        //System.arraycopy(arr, 0, b, 0, arr.length);

        //b[] = Arrays.copyOf(arr, arr.length);

        //b[] = Arrays.copyOfRange(a, 0, arr.length);
    }
}


