public class SquareRombousPattern {
    public static void main(String[] args) {
        squareStarPattern(5);

        System.out.println();

        hollowSquareStarPattern(5);

        System.out.println();

        hollowSquareStarDiagonal(5);

        System.out.println();

        rhombusStarPattern(5);

        System.out.println();

        mirroredRhombusStar(5);
    }

    //Problem - 1
    public static void squareStarPattern (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Problem - 2
    public static void hollowSquareStarPattern (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Problem - 3
    public static void hollowSquareStarDiagonal (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n || i == j || j == (n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Problem - 4
    public static void rhombusStarPattern (int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }

            for(int k = 1; k <= n; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    //Problem - 5
    public static void mirroredRhombusStar (int n) {
        for(int i = 1; i <= n; i++) {
            for(int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
