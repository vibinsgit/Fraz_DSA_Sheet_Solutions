public class LoopPratice3 {
    public static void main(String[] args) {
        //Problem - 1
        lcmOfTwoNumbers(5, 10);

        hcfOfTwoNumbers(12, 30);

        printArmstrongNumber2(371);

        printArmstrongSeries(1000);
    }

    //Problem - 1
    //Write a program to input two numbers from user and find LCM (Lowest Common Multiple).
    public static void lcmOfTwoNumbers(int num1, int num2) {
        int i, max, lcm;

        if(num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        i = max;

        while(true) {
            if(i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }

            i += max;
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    //Problem - 2
    //Write a program to input two numbers from the user and find HCF (Highest Common Factor) / GCD (Greatest Common Divisor).
    public static void hcfOfTwoNumbers(int num1, int num2) {
        int hcf = 1, min;

        if(num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        for(int i = 1; i <= min; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
    }

    //Problem - 3
    //Write a program to input a number from the user and check whether the given number is an Armstrong number or not.
    public static void printArmstrongNumber1 (int num) {
        int orginalNum = num;
        int sum = 0;

        while(num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if(orginalNum == sum) {
            System.out.println(sum + " is armstrong number.");
        } else {
            System.out.println(sum + " is not an armstrong number.");
        }
    }
    
    //Way - 2
    public static void printArmstrongNumber2 (int num) {
        int orginalNum, sum, digits, lastDigit;

        orginalNum = num;
        sum = 0;
        digits = 0;

        if(num == 0) {
            digits = 1;
        }

        while (num != 0) {
            num = num / 10;
            ++digits;
        }

        num = orginalNum;
        while (num > 0) {
            lastDigit = num % 10;
            sum += (int) Math.pow(lastDigit, digits);
            num = num / 10;
        }

        if(orginalNum == sum) {
            System.out.println(sum + " is armstrong number.");
        } else {
            System.out.println(sum + " is not an armstrong number.");
        }
    }

    //Problem - 5
    //Write a program to print all Armstrong numbers between 1 to n where n is the input given by the user.
    public static void printArmstrongSeries (int end) {
        int num, lastDigit, sum, digits;

        System.out.println("Armstrong numbers between 1 to " + end + " are : ");

        for(int i = 1; i <= end; i++) {

            sum = 0;
            digits = 0;

            num = i;
            while (num > 0) {
                num = num / 10;
                ++digits;
            }

            //digits = (int) Math.log10(num) + 1; It is possible.

            num = i;
            while(num > 0) {
                lastDigit = num % 10;
                sum = sum + (int) Math.pow(lastDigit, digits);
                num = num / 10;
            }

            if(i == sum) {
                System.out.print(i +  " ");
            }

        }
    }
}

