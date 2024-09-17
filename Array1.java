package com.roshni;
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int[] s=new int[3];
        // for(int i=0; i<s.length; i++){
        //     s[i]=sc.nextInt();
        //     // System.out.print(s[i]);
        // }
        // for(int num: s){
        //     System.out.print(num+" ");
        // }
        // System.out.println(Arrays.toString(s));
        


        // int[] roll= new int[2];
        // roll[1]=20;
        // System.out.println(roll[1]);
        // int[] serial={1,2,3,4};
        // System.out.println(serial[1]);
        // int[] a; //declaration of array
        // a=new int[3]; //inialisation :Actual memory creation
        String[] str= new String[2];
        for(int i=0; i<str.length; i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="honey";
        System.out.println(Arrays.toString(str));

        
    }
}
