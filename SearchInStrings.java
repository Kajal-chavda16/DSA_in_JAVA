public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Kajal";
        char target = 'v';

        int ans = search(str, target);
        System.out.println(ans);
    }

    static int search(String str , char target){
        if (str.length() == 0) {
            return -1; 
        }

        for( int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == target) {
                return i ;
            }
        }

        return -1 ;

    }
}
