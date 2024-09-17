package com.roshni;
import java.util.*;
public class VarArgs {
    public static void main(String[] args) {
        fun(2,4,5,56,6);
        multiple(1,3,"dh");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a + b + Arrays.toString(v));
    }
}
