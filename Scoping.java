package com.roshni;

public class Scoping {
    static int x=10;
    public static void main(String[] args) {
        System.out.println(x);
        int x=222;
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }

}
