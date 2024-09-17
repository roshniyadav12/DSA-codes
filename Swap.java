package com.roshni;

public class Swap {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        swap(a,b);
        System.out.println(a + " "+ b);

        String name= "Roshni Yadav";
        String Orgname=Detail(name);
        System.out.println(Orgname);
        System.out.println(name);

    }
    static String Detail(String myname){
    myname= "Honey";
    return myname;
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
