package Linear_Search;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str="roshni";
        char ch='k';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(search2(str,ch));
    }
    static boolean search(String str, char ch){
        if(str.length()==0){
            return false;
        }
        for(int index=0; index<str.length(); index++){
            if(ch==str.charAt(index)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str, char target){
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
}
