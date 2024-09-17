package com.roshni;
import java.util.*;

public class Function {
    public static void main(String[] args) {
        // sum();
        // sum();
        // int ans=sum2();
        // System.out.println(ans);
        int ans=sum3(20,50);
        System.out.println(ans);
    }
    static int sum3(int a, int b){
        int sum =a+b;
    return sum;
    }

    static int sum2(){
        Scanner sc= new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter 1 numbers: ");
        num1=sc.nextInt();
        System.out.print("Enter 2 numbers: ");
        num2=sc.nextInt();
        sum=num1+num2;
        return sum;
    }

    // static void sum(){
    //     Scanner sc= new Scanner(System.in);
    //     int num1, num2, sum;
    //     System.out.print("Enter two numbers: ");
    //     num1=sc.nextInt();
    //     num2=sc.nextInt();
    //     sum=num1+num2;
    //     System.out.println(sum);
    // }
}
