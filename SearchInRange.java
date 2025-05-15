package com.roshni;

import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        String name="Roshni";
        char ch='o';
        int[] arr={22,33,55,32};
        int target=32;
        System.out.println(Search2(arr, target, 0,3));
        System.out.println(Search(name,ch));
        System.out.println(Arrays.toString(name.toCharArray()));  
    }
    static int Search2(int[] arr, int target,int start, int end){
        if(arr.length==0){
            return -1;
        }
        
        for(int i=start; i<=end; i++){
            int element=arr[i];
            if(element==target){
                return i;
                // return arr[i];      for retuening the element
            }
        
        }
        return -1;
    }
    static boolean Search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=1; i<=5; i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
