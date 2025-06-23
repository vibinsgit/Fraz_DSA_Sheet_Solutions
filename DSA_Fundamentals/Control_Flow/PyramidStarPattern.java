public class PyramidStarPattern {
    public static void main(String[] args) {
       pyramidStarPattern(5);
       System.out.println();
       
       hollowPyramidStarPattern(5);
       System.out.println();

       invertedPyramidStarPattern(5);
       System.out.println();

       hollowInvertedPyramidStarPattern(5);
    }

    //Problem - 1
    public static void pyramidStarPattern (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem - 2
    public static void hollowPyramidStarPattern (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                if(i == 1 || i == n || k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Problem -3
    public static void invertedPyramidStarPattern (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * n) - (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem - 4
    public static void hollowInvertedPyramidStarPattern (int n) {
        for(int i  = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * n - (2 * i - 1)); k++) {
                if(i == 1 || i == n || k == 1 || k == (2 * n - (2 * i - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
