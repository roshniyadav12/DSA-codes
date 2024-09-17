package com.roshni;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
    //    String message= greet();
    //    System.out.println(message);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name=sc.next(); 
    String personalised = myGreet(name);
    System.out.println(personalised);
    }

    static String myGreet(String name){
        String mesage= "hello " +name;
        return mesage;
    }

    static String greet(){
       String mssg= "How are you";
        return mssg;
    }
}
