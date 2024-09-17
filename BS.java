package com.roshni.Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr={1,3,4,6};
        System.out.println(search(arr, 1, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid= s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return search(arr, target, s, mid-1);
        }
        return search(arr, target, mid+1, e);
    }
}
