package com.roshni;
import java.util.*;

public class MultiDimension {
    public static void main(String[] args) {
       // int[][] arr=new int[3][3];
        // int[][] arr={
        //     {1,2},
        //     {4,5,6},
        //     {7,8,9,99}
        // };

        Scanner sc=new Scanner(System.in);
         int[][] arr=new int[3][3];
         System.out.println(arr.length);
         for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]=sc.nextInt();
            }
         }
         for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
               System.out.print(arr[row][col]+" ");
            }
            System.out.println();
         }
         for(int row=0; row<arr.length; row++){
           System.out.println(Arrays.toString(arr[row]));
         }
         for(int[] a:arr){
            System.out.println(Arrays.toString(a));
         }
    }
}
