package com.roshni;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {12,4,55,23},
            {658,7},
            {72,66,99,122}
        };
        int target=55;
        int[] ans=search(arr,target);
        int max=maximum(arr);
        System.out.println(max);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int maximum(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
