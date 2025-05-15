package com.roshni.Recursion3;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // sunSeq("", "abc");
        // sunSeqAscII("", "abc");
        // System.out.println(SubSeqReturn("","abc"));
        System.out.println(SubSeqASCIIReturn("","abc"));
       
    }
    static void sunSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        sunSeq(p+ch, up.substring(1));
        sunSeq(p, up.substring(1));

    }
    static void sunSeqAscII(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        sunSeqAscII(p+ch, up.substring(1));
        sunSeqAscII(p, up.substring(1));
        sunSeqAscII(p+ (ch+0), up.substring(1));
        

    }
    static ArrayList<String> SubSeqReturn(String p, String up){
       if(up.isEmpty()){
        ArrayList<String> list=new ArrayList<String>();
        list.add(p);
        return list;
       } 
       char ch=up.charAt(0);
       ArrayList<String> left=SubSeqReturn(p+ch, up.substring(1));
       ArrayList<String> right=SubSeqReturn(p, up.substring(1));
       left.addAll(right);
       return left;
    }

    static ArrayList<String> SubSeqASCIIReturn(String p, String up){
        if(up.isEmpty()){
         ArrayList<String> list=new ArrayList<String>();
         list.add(p);
         return list;
        } 
        char ch=up.charAt(0);
        ArrayList<String> first=SubSeqASCIIReturn(p+ch, up.substring(1));
        ArrayList<String> second=SubSeqASCIIReturn(p, up.substring(1));
        ArrayList<String> third=SubSeqASCIIReturn(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
     }
}
