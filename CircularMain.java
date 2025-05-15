package com.roshni.CircularQueue;



public class CircularMain {
        public static void main(String[] args) {
        CircularQueue list=new CircularQueue(5);
        list.insert(11);
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(15);
        list.display();
        list.remove();
        list.remove();
        list.insert(11);
        list.insert(12);
       
        list.display();
    }
}
