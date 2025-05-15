package com.roshni.Binary;

public class Mountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,2,1};
        int ans=peakkIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakkIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid= start+ (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
