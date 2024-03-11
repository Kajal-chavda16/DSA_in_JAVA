import java.util.ArrayList;
import java.util.Arrays;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = {18,18,3,2,1,9,9};

        System.out.println(isPresent(arr, 18, 0));
        System.out.println(findIndex(arr, 18, 0));
        System.out.println(findIndexFromLast(arr, 18, arr.length-1));
        helper(arr, 18, 0);
        // System.out.println(list);
        System.out.println(findAllIndexList(arr, 18, 0, new ArrayList<>()));
    }

    static boolean isPresent(int[] arr , int target , int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || isPresent(arr, target, index+1);
    }

    static int findIndex(int[] arr , int target , int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index+1);
    }

    static int findIndexFromLast(int[] arr , int target , int index){
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndexFromLast(arr, target, index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr , int target , int index){
       
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }
    static void helper(int[] arr,int target , int index){
        findAllIndex(arr, target, index);
        System.out.println(list);
    }

    static ArrayList<Integer> findAllIndexList(int[] arr , int target , int index,ArrayList<Integer> list1){
       
        if (index == arr.length) {
            return list1;
        }
        if (arr[index] == target) {
            list1.add(index);
        }
        return findAllIndexList(arr, target, index+1,list1);
    }
}
