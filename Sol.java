import java.util.ArrayList;
import java.util.Arrays;

public class Sol {
    public static void main(String[] args) {
        int[] arr1={1,2,2,1};
        int[] arr2={2,2};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        int[] remove = removeDuplicate(nums1);
        int[] remove1 = removeDuplicate(nums2);
        ArrayList<Integer> list = new ArrayList<>();
    
            for(int i = 0 ; i <= remove.length -1 ; i++){
                int j = 0 ;
                while (j <= remove1.length - 1) {
                    if(remove[i] ==remove1[j]){
                        list.add(remove[i]);
                    } 
                    j++;   
                }
            }

        // convert list to array    
        int[] result = new int[list.size()];
        int i = 0 ;
        for(int val : list){
            result[i++] = val;
        }
        return result;
    }

    static int[] removeDuplicate(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int value: nums) {
            if (!list.contains(value)) {
                list.add(value);
            }
        }
        int[] result = new int[list.size()];
        int i = 0 ;
        for(int val : list){
            result[i++] = val;
        }
        return result;
    }
       
}

