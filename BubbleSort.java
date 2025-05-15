package Practise;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={7,3,44,1,5,67,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
