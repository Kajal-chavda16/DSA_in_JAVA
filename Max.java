public class Max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(maxVal(arr));
        System.out.println(maxRange(arr , 1 , 3));
    }

    static int maxVal(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max ;
    }

    static int maxRange(int[] arr , int start , int end) {
        int max = arr[0];

        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max ;
    }
}
