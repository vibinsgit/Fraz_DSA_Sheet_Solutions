public class LoopPratice4 {
    public static void main(String[] args) {
        isPerfectNumber(0);

        isPerfectNumberSeries(100);
        System.out.println();

        isStrongNumber(145);

        isStrongNumberSeries(1000);
    }

    //Problem - 1
    //Write a program to input a number and check whether the number is a Perfect number or not.
    public static void isPerfectNumber (int num) {
        int sum = 0;

        for(int i  = 1; i < num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(num == sum && num > 0) {
            System.out.println(num + " is perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    } 

    //Problem - 2
    //Write a program to find all Perfect numbers between 1 to n where n is the input given by the user.
    public static void isPerfectNumberSeries (int end) {
        int sum;

        System.out.print("Perfect numbers between 1 to " + end + " : ");
        
        for(int i = 1; i < end; i++) {
            sum = 0;
            for(int j = 1; j < i; j++) {
                if(i % j == 0) {
                    sum += j;
                }
            }

            if(sum == i) {
                System.out.print(sum + " ");
            }
        }
    }

    //Problem - 3
    //Write a program to input a number from the user and check whether the given number is a strong number or not.
    public static int findFact (int num) {
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void isStrongNumber (int num) {
        int orginalNum = num;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum = sum + findFact(rem);
            num = num / 10;
        }

        if(orginalNum == sum) {
            System.out.println(sum + " is strong number.");
        } else {
            System.out.println(sum + " is not a strong number.");
        }
    }

    //Problem - 4
    //Write a program to print all strong numbers between 1 to n where n is the input given by the user.
    public static boolean isStrongNumberCheck (int num) {
        int orginalNum = num;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum = sum + findFact(rem);
            num = num / 10;
        }

        if(orginalNum == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void isStrongNumberSeries (int end) {

        System.out.println("Strong numbers between 1 - " + end + " : ");

        for(int i = 1; i < end; i++) {
            if(isStrongNumberCheck(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
