package com.roshni;

public class FindMin1 {
    public static void main(String[] args) {
        int[] arr={442,78,5,87,476};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
       int ans= arr[0];
       for(int i=1; i<arr.length; i++){
        if(arr[i]<ans){
            ans=arr[i];
        }
       }
       return ans;
    }
}
