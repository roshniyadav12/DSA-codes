package com.roshni.TP;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //declaring an array
        int arr[];
        //initialzing an array of 8 int
        arr=new int[8];
        System.out.println("array before adding data");
        display(arr);

        Scanner sc=new Scanner(System.in);
        //insertion
        for(int i=0; i<arr.length; i++){
            //arr[i]=i;
            arr[i]=sc.nextInt();
        }
        display(arr);
        arr[0]=21;
        display(arr);
        //search using value 4
        int value=21;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== value){
                System.out.println("item found at index "+ i);
                break;
            }
            
        }
    }
    private static void display(int arr[]){
        System.out.print("Array [");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println("]");
        System.out.println();
    }
}
