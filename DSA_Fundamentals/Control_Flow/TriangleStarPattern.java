public class TriangleStarPattern {
    public static void main(String[] args) {
        rightTriangleStarPattern(5);
        System.out.println();

        hollowRightTriangleStarPattern(5);
        System.out.println();

        mirroredRightTriangleStarPattern(5);
        System.out.println();

        hollowMirroredRightTriangle(5);
        System.out.println();

        invertedRightTriangle(5);
    }

    //Problem - 1
    public static void rightTriangleStarPattern (int n) {
        for(int i = 1; i <= n ; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem - 2
    public static void hollowRightTriangleStarPattern (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if(j == 1 || i == n || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Problem - 3
    public static void mirroredRightTriangleStarPattern (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem - 4
    public static void hollowMirroredRightTriangle (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                if(i == 1 || i == n || k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Problem - 5
    public static void invertedRightTriangle (int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}