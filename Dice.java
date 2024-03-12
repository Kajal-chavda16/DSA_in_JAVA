import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceCount("", 5));
    }

    static void dice(String p , int target){
        if (target == 0) {
            System.out.print(p+" ");
            return ;
        }

        for(int i = 1 ; i <= 6 && i <= target ; i++){
            dice(p + i, target - i);
        }
    }

    static void diceFace(String p , int target , int face){
        if (target == 0) {
            System.out.print(p+" ");
            return ;
        }

        for(int i = 1 ; i <= face && i <= target ; i++){
            diceFace(p + i, target - i , face);
        }
    }

    static ArrayList<String> diceList(String p , int target){
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1 ; i <= 6 && i <= target ; i++){
            ans.addAll(diceList(p + i, target - i));
        }
        return ans ;
    }

    static int diceCount(String p , int target){
        if (target == 0) {
            // System.out.print(p+" ");
            return 1;
        }
        int count = 0 ;
        for(int i = 1 ; i <= 6 && i <= target ; i++){
            count = count + diceCount(p + i, target - i);
        }
        return count;
    }
}
