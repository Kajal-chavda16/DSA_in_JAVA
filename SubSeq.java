import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {
    public static void main(String[] args) {
        subseqAsci("", "abc");
        System.out.println(subseqRetAsci("", "abc"));
    }

    static void subseq(String p , String up){
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p , up.substring(1));
    }

    static ArrayList<String> subseqRet(String p , String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left =  subseqRet(p + ch, up.substring(1));
        ArrayList<String> right =  subseqRet(p , up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqAsci(String p , String up){
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);
        subseqAsci(p + ch, up.substring(1));
        subseqAsci(p + (ch+0), up.substring(1));
        subseqAsci(p , up.substring(1));
    }

    static ArrayList<String> subseqRetAsci(String p , String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first =  subseqRetAsci(p + ch, up.substring(1));
        ArrayList<String> second =  subseqRetAsci(p, up.substring(1));
        ArrayList<String> third =  subseqRetAsci(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
