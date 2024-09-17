package com.roshni;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr={24 ,88,76,35};
        System.out.println(max(arr,0,3));
    }
    static int max(int[] arr, int start, int end){
        if(arr==null){
            return -1;
        }
        
        int maxVal=arr[start];
    for(int i=start; i<=end; i++){
        if(arr[i]>maxVal){
            maxVal=arr[i];
        }
    }
    return maxVal;
    }
}
