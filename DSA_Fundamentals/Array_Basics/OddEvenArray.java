public class OddEvenArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenDigits = 0;
        int oddDigits = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                evenDigits++;
            } else {
                oddDigits++;
            }
        }
        int j = 0;
        int k = 0;

        int[] evenArray = new int[evenDigits];
        int[] oddArray = new int[oddDigits];

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                evenArray[j++] = array[i];
            } else {
                oddArray[k++] = array[i];
            }
        }
    }
}
