import java.util.ArrayList;

public class PhonePad{
    public static void main(String[] args) {
        String str = "12";
        System.out.println(padCount("", str));
    }

    static void pad(String p , String up){
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }
        int digit = up.charAt(0) - '0';

        for(int i = (digit - 1) * 3 ; i < digit * 3 ; i++){
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padList(String p , String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
       
        for(int i = (digit - 1) * 3 ; i < digit * 3 ; i++){
            char ch = (char) ('a' + i);
            ans.addAll(padList(p + ch, up.substring(1)));
        }

        return ans;
    }

    static int padCount(String p , String up){
        if (up.isEmpty()) {
            // System.out.print(p+" ");
            return 1;
        }
        int digit = up.charAt(0) - '0';
        int count = 0 ;
        for(int i = (digit - 1) * 3 ; i < digit * 3 ; i++){
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}