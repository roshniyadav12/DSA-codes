package com.roshni.TP;

public class LinkedList {
    private Link1 first;
    public LinkedList(){
        first=null;
    }

    //INSERTION AT FIRST
    public void insertFirst(int key, int data){
        Link1 link=new Link1(key, data);
        link.next=first;
        first=link;
    }

    //DISPLAYING
    public void display(){
        Link1 current=first;
        System.out.print("{ ");
        while(current!=null){
            current.display();
            current=current.next;
        }
        System.out.print(" }");
    }

    //DELETE AT FIRST
    public Link1 deleteFirst(){
        Link1 temp= first;
        first=first.next;
        return temp;
    }
   
    //Finding a key
    public Link1 find(int key){
        Link1 current=first;
        if(first==null){
            return null;
        }
        while(current.key!=key){
            if(current.next==null){
                return null;
            }
            else{
                current=current.next;
            }
        }
        return current;
    } 


    //deleting at particular index

    public Link1 delete(int key){
        Link1 current=first;
        Link1 previous=null;

        if(first==null){
            return null;
        }
        while(current.key!=key){
            if(current.next==null){
                return null;
            }
            else{
                previous=current;
                current=current.next;
                
            }
        }
        if(current==first){
            first=first.next;
        }
        else{
            previous.next=current.next;
        }
        return current;
        
    }

    //is Empty
    public boolean isEmpty(){
      return first==null ;
    }

}
