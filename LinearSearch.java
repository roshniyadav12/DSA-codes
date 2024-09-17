package com.roshni;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int target=2;
        int ans=Search2(nums,target);
        System.out.println(ans);
    }

    static boolean Search3(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        
        for(int element:arr){
            if(element==target){
                return true;
                // return arr[i];      for retuening the element
            }
        
        }
        return false;
    }


    static int Search2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        
        for(int element: arr){
            if(element==target){
              
                 return element;      //for retuening the element
            }
        
        }
        return -1;
    }





    static int Search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        
        for(int i=0; i<arr.length; i++){
            int element=arr[i];
            if(element==target){
                return i;
                // return arr[i];      for retuening the element
            }
        
        }
        return -1;
    }
}
