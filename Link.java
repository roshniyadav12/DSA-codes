package com.roshni.DLL;

public class Link {
    int key;
    int data;
    Link prev;
    Link next;
    public Link(int key,int data){
        this.key=key;
        this.data=data;
    }
    public void display(){
        System.out.print("("+key+ ","+ data+")");
    }
}
