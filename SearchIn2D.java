import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1,4,7,8} ,
            {11,44,77} ,
            {222,555} ,
            {68}
        };

        int target = 8 ;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr , int target){

        for(int rows = 0 ; rows < arr.length ; rows++){
            for(int cols = 0 ; cols < arr[rows].length ; cols++){
                if (arr[rows][cols] == target) {
                    return new int[]{rows,cols} ;
                }
            }
        }

        return new int[]{-1,-1} ;
    }
}
