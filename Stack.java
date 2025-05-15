package com.roshni.Stack;

public class Stack {
    int size;
    int[] arr;
    int top;
    public Stack(int size){
        this.size=size;
        arr= new int[size];
        top=-1;
    }
    public void push(int data){
        if(!isfull()){
        arr[++top]=data;
        }
        else{
            System.out.println("Stack is empty");
        }
    }
    public int pop(){
        return arr[top--];
    }
    public int peak(){
        return arr[top];
    }
    public boolean isfull(){
        return (top==size-1);
    }
    public boolean isEmpty(){
        return (top==-1);
    }

    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack peak: "+ stack.peak());
        while(!stack.isEmpty()){
            int data=stack.pop();
            System.out.println(data);
        }
        System.out.println("Is Full: "+ stack.isfull());
        System.out.println("Is Empty: "+ stack.isEmpty());
       
    }
}
