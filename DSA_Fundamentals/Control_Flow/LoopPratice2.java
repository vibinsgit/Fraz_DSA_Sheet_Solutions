public class LoopPratice2 {
    public static void main(String[] args) {
        factorsOfNumber(12);

        System.out.println();

        int num1 = 17;
        if(findIsPrime(num1)) {
            System.out.println(num1 + " is prime number.");
        } else {
            System.out.println(num1 + " is composite number.");
        }

        primeSeries(20);

        System.out.println();

        primeFactors(10);
    }

    //Problem - 1
    //Write a Program to input a number from user and find all factors of the given number using for loop. 
    public static void factorsOfNumber (int num) {
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    //Problem - 2
    //Write a program in to input a number and check whether the number is prime number or not using for loop.
    public static boolean findIsPrime (int num) {
        boolean isPrime = true;

        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime && num > 1) {
            return true;
        }

        return false;
    }

    //Problem - 3
    //Write a program to print all Prime numbers between 1 to n using loop
    public static void primeSeries (int end) {
        for(int i = 2; i < end; i++) {
            int isPrime = 1;

            for(int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = 0;
                    break;
                }
            }

            if(isPrime == 1) {
                System.out.print(i + " ");
            }
        }
    }

    //Problem - 4
    //Write a program to input a number from user and find Prime factors of the given number using loop.
    public static void primeFactors (int num) {
        int isPrime;
        for(int i = 2; i <= num; i++) {
            if(num % i == 0) { //factor of num
                isPrime = 1;
                for(int j = 2; j <= i / 2; j++) {
                    if(i % j == 0) {
                        isPrime = 0;
                        break;
                    }
                }

                if(isPrime == 1) {
                    System.out.print(i +  " ");
                }
            }
        }
    }

}
