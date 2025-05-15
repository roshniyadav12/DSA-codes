package com.roshni.DLL;

public class DoublyLinkedList {
   private Link first;
   private Link last;
   public DoublyLinkedList(){
    first=null;
    last=null;
   }
   public boolean isEmpty(){
    return first==null;
   }

   //insertFirst
   public void insertFirst(int key, int data){
    Link link=new Link(key, data);
    if(isEmpty()){
        last=link;
    }
    else{
        first.prev=link;
    }
    link.next=first;
    first=link;

   }

   //insertLast
   public void insertLast(int key, int data){
    Link link=new Link(key,data);
    if(isEmpty()){
        last=link;
    }
    else{
        last.next=link;
        link.prev=last;
    }
    last=link;
   }

   //display first to last
   public void displayForward(){
    Link current=first;
    System.out.print("[ ");
    while(current!=null){
        current.display();
        current=current.next;
    }
    System.out.println(" ]");
   }

   //display from last to first
   public void displayBackward(){
    Link current=last;
    System.out.print("[");
    while(current!=null){
        current.display();
        current=current.prev;
    }
    System.out.print("]");
   }
    
   //delete at first
   public Link deleteFirst(){
    Link tempLink=first;
    if(first.next==null){
        last=null;
    }
    else{
        first.next.prev=null;
    }
    first=first.next;
    return tempLink;
   }

   //delete at last
   public Link deleteLast(){
    Link tempLink=last;
    if(first.next==null){
        first=null;
    }
    else{
        last.prev.next=null;
    }
    last=last.prev;
    return tempLink;
   }


   //delete at particular index
   public Link delete(int key){
    Link current=first;
    if(first==null){
        return null;
    }
    while(current.key != key){
        if(current.next==null){
            return null;
        }
        else{
            current=current.next;
        }
    }
    if(current==first){
        first=current.next;
    }
    else{
        current.prev.next=current.next;
    }
    if(current==last){
        last=current.prev;
    }
    else{
        current.next.prev=current.prev;
    }

    return current;

   }

   //insert after key

   public boolean insertAfter(int key,int newKey,int data){
    Link current=first;
    if(first==null){
        return false;
    }
    while(current.key != key){
        if(current.next==null){
            return false;
        }
        else{
            current=current.next;
        }
    }
    Link newLink=new Link(newKey, data);
    if(current==last){
        newLink.next=null;
        last=newLink;
    }
    else{
        newLink.next=current.next;
        current.next.prev=newLink;
    }
    newLink.prev=current;
    current.next=newLink;
    

    return true;
   }
}
