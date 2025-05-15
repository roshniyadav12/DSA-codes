package com.roshni.Recursion2;

import java.util.ArrayList;

public class Find {
     public static void main(String[] args) {
        int[] arr={1,54,98,2,5,98};
        System.out.println(findIndexLast(arr, 98, arr.length-1));
        findAllIndex(arr, 98, 0);
        System.out.println(list);
        System.out.println(findAllIndex1(arr, 98, 0, new ArrayList<>()));
     }
     static boolean find(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
     }
     static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }

     }
     static int findIndexLast(int[] arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndexLast(arr, target, index-1);
        }

     }
     static ArrayList<Integer> list= new ArrayList<>();
     static void findAllIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        
            findAllIndex(arr, target, index+1);
        

     }
     static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
          return  findAllIndex1(arr, target, index+1,list);
     }
     static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list= new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        // it will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }
          ArrayList<Integer> ansfrombelowCalls=  findAllIndex2(arr, target, index+1);
          list.addAll(ansfrombelowCalls);
          return list;
     }
}
