package com.roshni.Sorting;


public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={4,0,2,1};
       System.out.println( MissingNumber(nums));
    }
    static int MissingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if( arr[i] < arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
}
