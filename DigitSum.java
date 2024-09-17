package com.roshni.Recursion1;

public class DigitSum {
    public static void main(String[] args) {
        int ans=product(1342);
        System.out.println(ans);
        concept(5);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+ sum(n/10);
    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)* product(n/10);
    }
    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        concept(--n);
        // diff b/w n-- and --n
    }
}
