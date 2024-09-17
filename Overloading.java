package com.roshni;

public class Overloading {
    public static void main(String[] args) {
        fun(10);
        fun("aradhana");
        int ans=sum(2,3,4);
        System.out.println(ans);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String b){
        System.out.println(b);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
