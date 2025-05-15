package com.roshni.DLL;

public class Demo {
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertFirst(1,10);
        list.insertFirst(2, 20);
        list.insertFirst(3, 30);
        list.insertLast(4, 40);
        list.deleteFirst();
        list.deleteLast();
        list.delete(2);
        list.insertAfter(1,7,13);
        list.displayForward();
        
        list.displayBackward();
       
    }
}
