package com.roshni;

public class StringAll {
    public static void main(String[] args) {
        String name="roshni";
        System.out.println(name);
        String c="happy";
        String d="happy";
        System.out.println(c==d);
        String a=new String("fjs");
        String b=new String("fjs");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.charAt(0));
        String series="";
        for(int i=0; i<26; i++){
            char ch=(char)('a'+i);
            System.out.println(ch);
        }
    }
}
