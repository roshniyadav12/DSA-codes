package com.roshni;

public class ReverseNum {
    public static void main(String[] args) {
        int num=384637;
        int ans=0;
        while(num>0){
            int rem= num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        System.out.println(ans);
    }
}
