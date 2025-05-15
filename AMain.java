package com.roshni.AVL;

public class AMain {
    public static void main(String[] args) {
        AVL tree=new AVL();
        for(int i=0; i<10; i++){
            tree.insert(i);
        }
        // System.out.println(tree.height());
    }
}
