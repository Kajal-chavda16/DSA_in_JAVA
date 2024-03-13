import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] b = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        allPaths("", b, 0, 0);
        System.out.println();
        int[][] arr = new int[b.length][b[0].length];
        allPathsSteps("", b, 0, 0, arr, 1);
    }

    static void allPaths(String p, boolean[][] board, int r, int c) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.print(p + " ");
            return;
        }

        if (!board[r][c]) {
            return;
        }

        board[r][c] = false;

        if (r < board.length - 1) {
            allPaths(p + 'D', board, r + 1, c);
        }
        if (c < board[0].length - 1) {
            allPaths(p + 'R', board, r, c + 1);
        }
        if (r > 0) {
            allPaths(p + 'U', board, r - 1, c);
        }
        if (c > 0) {
            allPaths(p + 'L', board, r, c - 1);
        }

        board[r][c] = true;

    }

    static void allPathsSteps(String p, boolean[][] board, int r, int c, int[][] path, int step) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            path[r][c] = step;
                for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
                }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!board[r][c]) {
            return;
        }

        board[r][c] = false;
        path[r][c] = step;

        if (r < board.length - 1) {
            allPathsSteps(p + 'D', board, r + 1, c, path, step + 1);
        }
        if (c < board[0].length - 1) {
            allPathsSteps(p + 'R', board, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            allPathsSteps(p + 'U', board, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            allPathsSteps(p + 'L', board, r, c - 1, path, step + 1);
        }

        board[r][c] = true;
        path[r][c] = 0;

    }
}
