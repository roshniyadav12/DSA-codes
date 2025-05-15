package com.roshni.TP;

public class Link1 {
    int key;
    int data;
    Link1 next;
    public Link1(int key, int data){
        this.key=key;
        this.data=data;
    }
    public void display(){
        System.out.print("{" + key +", " +data+"} ");
    }
}
