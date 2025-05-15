package Binary_Search;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,8,8,8,9};
        int target=8;
        int[] ans=index(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] index(int[] nums, int target){
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=search(nums, target, false);
        }
        return ans;
    }
    static int search(int[] nums, int target, boolean findFirst){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target> nums[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(findFirst){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
