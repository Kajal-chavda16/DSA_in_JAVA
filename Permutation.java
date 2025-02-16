import java.util.ArrayList;

public class Permutation{
    public static void main(String[] args) {
        String str = "bc";
        System.out.println(permutaionsCount("", str));
    }

    static void permutaions(String p , String up){
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0 ; i <= p.length() ; i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutaions(first + ch + second, up.substring(1));
        }
    }

    static ArrayList<String> permutaionsList(String p , String up){
        if (up.isEmpty()) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }

        ArrayList<String> ans  = new ArrayList<>();
        char ch = up.charAt(0);

        for(int i = 0 ; i <= p.length() ; i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutaionsList(first + ch + second, up.substring(1)));
        }

        return ans ;
    }

    static int permutaionsCount(String p , String up){
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0 ;
        for(int i = 0 ; i <= p.length() ; i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutaionsCount(first + ch + second, up.substring(1));
        }

        return count;
    }

}