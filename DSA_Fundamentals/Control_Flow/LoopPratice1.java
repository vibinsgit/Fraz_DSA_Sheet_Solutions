public class LoopPratice1 {
    public static void main(String[] args) {
        int result1 = findFirstLastDigitSum(123456);
        System.out.println("Sum of first and last digit = " + result1);
        
        int result2 = productOfDigits(1234);
        System.out.println("Product of Digits : " + result2);

        int n1 = 123;
        boolean result3 = checkPalindrome(n1);
        if(result3) {
            System.out.println(n1 + " is palindrome.");
        } else {
            System.out.println(n1 + " is not a palindrome.");
        }

        int base = 2, exponent = 5;
        int result4 = powerOfNumber(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result4);
        
        findFibonacciSeries1(10);
    }

    //Problem-1
    //Write a program to input a number and find the sum of first and last digit of the number using a for loop.
    public static int findFirstLastDigitSum (int num) {

        int firstDigit, lastDigit, sum = 0;
        num = Math.abs(num);

        if(num < 10) {
            return num;
        }

        lastDigit = num % 10;

        while(num >= 10) {
            num = num / 10;
        }

        firstDigit = num;

        sum = firstDigit + lastDigit;

        return sum;
    }

    //Problem - 2
    //Write a program to input a number from the user and calculate product of its digits. 
    public static int productOfDigits(int num) {
        int productOfNumber = 1;

        while(num > 0) {
            int remainder = num % 10;
            productOfNumber *= remainder;
            num /= 10;
        }

        return productOfNumber;
    }

    //Problem - 3
    //Write a program to input number from user and check number is palindrome or not using loop.
    public static boolean checkPalindrome (int num) {
        int orginalNumber = num;
        int newNumber = 0;

        while(num > 0) {
            newNumber = (newNumber * 10) + (num % 10);
            num = num / 10;
        }

        return orginalNumber == newNumber;
    }

    //Problem - 4
    //Write a program to find power of a number using for loop.
    public static int powerOfNumber (int base, int exponent) {
        int powerofNum = 1;
        for(int i = 0; i < exponent; i++) {
            powerofNum *= base;
        }

        return powerofNum;
    }

    //Problem - 5
    //Write a program to print Fibonacci series up to n terms using loop. 
    public static void findFibonacciSeries1 (int N) {
        int first = 0;
        int second = 1;
        System.out.print(first + ", ");
        System.out.print(second);

        for(int i = 2; i < N; i++) {
            int third = first + second;
            System.out.print(", " + third);
            first = second;
            second = third;
        }
    }

    public static void findFibonacciSeries2 (int N) {
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 2; i < N; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }

}
