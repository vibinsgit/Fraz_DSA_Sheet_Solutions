public class MiscellaneousStarPattern {
    public static void main(String[] args) {
        diamondStarPattern(5);
        System.out.println();

        rightArrowStarPattern(5);
        System.out.println();

        plusSignPattern(5);
        System.out.println();

        crossStarPattern(5);
        System.out.println();

        starPattern(5);
    }

    //Problem - 1
    public static void diamondStarPattern (int n) {

        int spaces = n - 1;
        int stars = 1;

        for(int i = 1; i < 2 * n; i++) {

            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k < 2 * stars; k++) {
                System.out.print("*");
            }
            System.out.println();

            if(i < n) {
                spaces--;
                stars++;
            } else {
                spaces++;
                stars--;
            }
        }
    }

    //problem - 2
    public static void rightArrowStarPattern (int n) {
        int spaces = 0;
        int stars = n;

        for(int i = 1; i < 2 * n; i++) {
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            if(i < n) {
                spaces = spaces + 2;
                stars--;
            } else {
                spaces = spaces - 2;
                stars++;
            }
        }
    }

    //Problem - 3
    public static void plusSignPattern (int n) {
        for(int i = 1; i < 2 * n; i++) {
            for(int j = 1; j < 2 * n; j++) {
                if (i == n || j == n) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Problem - 4
    public static void crossStarPattern (int n) {
        for(int i = 1; i < 2 * n; i++) {
            for(int j = 1; j < 2 * n; j++) {
                if(j == i ||j == (2 * n - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Problem - 5
    public static void starPattern (int n) {
        for(int i = 1; i < n * 2; i++) {
            for(int j = 1; j <= n; j++) {
                if((i == 1 && (j == 1 || j == n)) ||
                   (i == n && (j == 1 || j == n)) ||
                   (i == (2 * n - 1) && (j == 1 || j == n))
                ) {
                    System.out.print(" ");
                } else if (i == 1 || i == n || i == (2 * n - 1) || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
