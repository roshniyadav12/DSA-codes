package com.roshni;

public class LinearSearch11 {
    public static void main(String[] args) {
        int[] nums={11,2,3,46,53,636,352,6266,777};
        int target=777;
        int ans=LinearSearch(nums,target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0; index<=arr.length; index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
