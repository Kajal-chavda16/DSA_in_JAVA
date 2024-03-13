import java.util.ArrayList;

public class Maze{
    public static void main(String[] args) {
        // System.out.println(mazeCount(3, 3));
        // mazePath("", 3, 3);
        // System.out.println();
        // System.out.println(mazePathList("", 3, 3));
        // System.out.println(mazePathDia("", 3, 3));

        boolean[][] b = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        mazePathRestriction("",b, 0, 0);
    }

    static int mazeCount(int r , int c){
        if (r==1 || c==1) {
            return 1;
        }

        int left = mazeCount(r-1, c);
        int right = mazeCount(r, c-1);
        return left + right ;
    }

    static void mazePath(String p , int r , int c){
        if (r==1 && c==1) {
            System.out.print(p+" ");
            return;
        }

        if (r>1) {
            mazePath(p + 'D', r-1, c);
        }
        if (c>1) {
            mazePath(p + 'R', r, c-1);
        }
    }

    static ArrayList<String> mazePathList(String p , int r , int c){
        if (r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (r>1) {
            ans.addAll(mazePathList(p + 'D', r-1, c));
        }
        if (c>1) {
            ans.addAll(mazePathList(p + 'R', r, c-1));
        }
        return ans ;
    }

    static ArrayList<String> mazePathDia(String p , int r , int c){
        if (r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (r>1) {
            ans.addAll(mazePathDia(p + 'D', r-1, c));
        }
        if (c>1) {
            ans.addAll(mazePathDia(p + 'R', r, c-1));
        }
        if (r>1 && c>1) {
            ans.addAll(mazePathDia(p + 'd', r-1, c-1));
        }
        return ans ;
    }

    static void mazePathRestriction(String p ,boolean[][] board, int r , int c){
        if (r == board.length-1 && c == board[0].length-1) {
            System.out.println(p);
            return;
        }

        if (!board[r][c]) {
            return;
        }

        if (r < board.length-1) {
            mazePathRestriction(p + 'D',board, r+1, c);
        }
        if (c < board[0].length-1) {
            mazePathRestriction(p + 'R',board, r, c+1);
        }
    }
}
