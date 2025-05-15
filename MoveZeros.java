package Array;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeros(int[] arr){
        int LastNonZeroIndex=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[LastNonZeroIndex]= arr[i];
                LastNonZeroIndex++;
            }
        }
        for(int i=LastNonZeroIndex; i<arr.length; i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,0,13,0,5};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
