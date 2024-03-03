public class MissingInRange0_N {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 5 };
        System.out.println(missingNum(arr));

    }

    static int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIn = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIn]) {
                swap(arr, i, correctIn);
            } else {
                i++;
            }
        }

        // case 1
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
