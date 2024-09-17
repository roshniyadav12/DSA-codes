package com.roshni.patterns;
/* 
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 1 2 3 4 5 6
 */

public class NoIncreasingPattern {
    public static void pattern(int n){
        int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n=6;
        pattern(n);
    }
}
