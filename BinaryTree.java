package com.roshni.Trees;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;
    
        private Node(int value){
            this.value=value;
        }
    }
    Node root;
    public void populate(Scanner scanner){
        System.out.println("Enter root node:");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);

    }
    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to insert left of "+ node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of "+node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to insert right of "+ node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right of "+node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if (node==null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left , indent+ "\t");
        display(node.right , indent+ "\t");
    }

    public void prettier(){
        prettier(root,0);
    }
    public void prettier(Node node, int level){
        if (node==null) {
            return;
        }
        prettier(node.right, level+1);
        if(level!=0){
            for(int i=0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|--->"+ node.value);
        }else{
            System.out.println(node.value);
        }
        prettier(node.left, level+1);
    }
  

}
