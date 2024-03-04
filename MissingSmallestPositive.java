public class MissingSmallestPositive {
    public static void main(String[] args) {
                int[] arr = { 3,4,-1,1 };
        System.out.println(missingNum(arr));

    }

    static int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIn = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIn]) {
                swap(arr, i, correctIn);
            } else {
                i++;
            }
        }

        // case 1
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
