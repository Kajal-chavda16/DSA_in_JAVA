public class PalindromeString {
    public static void main(String[] args) {
        String str1 = "ba";
        System.out.println(isPalindrome(str1));
    }

    static boolean isPalindrome(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        String rev1 = rev.toString();
        if (str.equals(rev1)) {
            return true;
        }
        return false;
    }
}
