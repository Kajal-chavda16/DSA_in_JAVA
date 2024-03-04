public class Patterns {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for column
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for column
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for column
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int c;
            if (row <= n) {
                c = row;
            } else {
                c = n - (row - n);
            }
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalColsInRow = row <= n ? row : n - (row - n);
            int noOfSpaces = n - totalColsInRow; // row <= n ? n - row : row - n

            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            int noOfSpaces = n - row;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int noOfSpaces = row <= n ? n - row : row - n;
            for (int s = 1; s <= noOfSpaces; s++) {
                System.out.print("  ");
            }
            if (row <= n) {
                for (int col = row; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= row; col++) {
                    System.out.print(col + " ");
                }
            } else {
                for (int col = n - (row - n); col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= n - (row - n); col++) {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        for(int row = 1 ; row <= 2*n - 1 ; row++){
            for(int col = 1 ; col <= 2*n - 1 ; col++){
               int atEveryIndex = (n) - ( Math.min( Math.min(col-1, row-1)  ,  Math.min((2*n-1)-col , (2*n-1)-row) ));
               System.out.print(atEveryIndex+" "); 
            }
            System.out.println();
        }
    }

}
