package com.roshni;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="maya";
        {
            // int a=77   ->Already initialized outside the block
            a=99;          // Reassign the original ref variable to some other value
            int c=34;
            name="aanchal";
            System.out.println(name);
            //value initialized in th block will remain in the block
        }
        System.out.println(name);
        System.out.println(a);
        //System.out.println(c);     -> cannot use outside the block


        for(int i=0; i<=3; i++){
            System.out.println(i);
            int h=18;
        }
       // System.out.println(i);
       //     h=18;
        


    }
}
