package com.roshni.Binary;
//equal to or 1 more than equal of that number
public class Ceiling {
    public static void main(String[] args) {
        int[] arr={-23,0,1,2,3,4,5,6,12,15,19,25};  
        int target=16;
        int ans= binarySearch(arr,target);
        System.out.println(ans);
      }
      static int binarySearch(int[] arr, int target){
          int start=0;
          int end=arr.length-1;
          while(start<=end){
             int mid= start + (end-start)/2;
             if(target<arr[mid]){
              end=mid-1;
             }
             else if(target>arr[mid]){
              start=mid+1;
             }
             else{
              return mid;
             }
          }
          return arr[start];
      }
}
