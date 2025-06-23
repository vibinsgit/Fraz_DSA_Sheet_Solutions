public class NumberPattern1 {
    public static void main(String[] args) {
        examplePattern1(5);
        System.out.println();

        examplePattern2(5);
        System.out.println();

        examplePattern3(5);
        System.out.println();

        examplePattern4(5);
        System.out.println();

        examplePattern5(5);
        System.out.println();

        examplePattern6(5);
        System.out.println();

        examplePattern7(5);
        System.out.println();

        examplePattern8(5);
        System.out.println();

        examplePattern9(5);
        System.out.println();

        examplePattern10(6, 5);
        System.out.println();

        examplePattern11(6, 5);
        System.out.println();
    }

    public static void examplePattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void examplePattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void examplePattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void examplePattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void examplePattern5(int n) {
        int digitSeries = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(digitSeries + " ");
                digitSeries++;
            }
            System.out.println();
        }
    }

    public static void examplePattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void examplePattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

    public static void examplePattern8(int n) {
        int startNum = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(startNum + j);
            }
            System.out.println();
            startNum--;
        }
    }

    public static void examplePattern9(int n) {
        int value = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value);
                if (value == 1) {
                    value = 0;
                } else {
                    value = 1;
                }
            }
            System.out.println();
        }
    }

    public static void examplePattern10 (int row, int col) {
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                if(i % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

    public static void examplePattern11 (int row, int col) {
        for(int i = 1; i <= row; i++) {
            for(int j = 0; j < col; j++) {
                if(j % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
    
}
