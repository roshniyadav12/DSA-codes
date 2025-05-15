package com.roshni.Binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr={-23,0,1,2,3,4,5,6,12,15,19,25};  
        int[] arr={98,87,76,65,54,43,32,21,1};
        int target=32;
        int ans= orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc;
        if(arr[start]< arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }
        while(start<=end){
           int mid= start + (end-start)/2;
           if(target==arr[mid]){
            return mid;
           }
           if(isAsc){
           if(target<arr[mid]){
            end=mid-1;
           }
           else {
            start=mid+1;
           }
        }
        else{
            if(target>arr[mid]){
             end=mid-1;
            }
            else {
             start=mid+1;
            }
         }
          
        }
        return -1;
    }
}
