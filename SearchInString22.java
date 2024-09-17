package com.roshni;

import java.util.Arrays;

public class SearchInString22 {
    public static void main(StringA[] args) {
        StringA name="Roshni";
        char target='o';
        System.out.println(linearSearch2(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean linearSearch2(StringA str, char target){
        if(str.length()==0){
            return false;
        }
       for(char ch: str.toCharArray()){
        if(ch==target){
            return true;
        }
       }
        
        return false;

    }



    static boolean linearSearch(StringA str, char target){
        if(str.length()==0){
            return false;
        }
        for(int index=0; index<str.length(); index++){
            if(target==str.charAt(index)){
                return true;
            }
        }
        return false;

    }
}
