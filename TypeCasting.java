package com.roshni;
import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // float a= input.nextFloat();
        // System.out.println(a);

        // int b= (int)(23.8726f);
        // System.out.println(b);

        // int c=257;
        // byte d= (byte)c; // 257 % 256= 1

        // System.out.println(d);

        // byte a= 50;
        // byte b=40;
        // byte c=100;
        // int d= (a*b)/c;
        // System.out.println(d);

        // int e= 'c';
        // System.out.println(e);

        byte b= 42;
        char c='a';
        short s= 1024;
        int i= 50000;
        float f= 5.67f;
        double d= 0.1234;
        double result= (f*b) + (i/c)- (d-s);
        // float + int - double = double
        System.out.println((f*b) +" "+ (i/c)+" "+ (d-s));
        System.out.println(result);
    }
}
