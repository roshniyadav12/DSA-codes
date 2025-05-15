package com.roshni.Queue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue list=new CustomQueue(5);
        list.insert(11);
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(15);
        list.display();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.display();
    }
}
