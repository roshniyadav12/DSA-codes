package Array;

import java.util.ArrayList;

public class Distinct {
    public static void main(String[] args) {
        int[] arr={12,10,5,12,7,5};
        ArrayList<Integer> res=findDistinct(arr);
        for(int val: res){
            System.out.print(val+" ");
        }
        
    }
    static ArrayList<Integer> findDistinct(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int j;
            for(j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(i==j){
                res.add(arr[i]);
            }
        }
        return res;
    } 
}
