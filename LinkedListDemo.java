package com.roshni.TP;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertFirst(1, 22);
        list.insertFirst(2, 99);
        list.insertFirst(3, 88);
        list.display();
        list.deleteFirst();
        list.display();
        
        Link1 foundList= list.find(1);
        if(foundList!=null){
            System.out.println("element found");
            foundList.display();
            System.out.println();
        }
        else{
            System.out.println("element not found");
        }


        list.insertFirst(3, 56);
        list.insertFirst(4, 14);
        list.insertFirst(5, 73);
        list.display();
        list.delete(4);
        list.display();
        list.isEmpty();
        
    }
}
