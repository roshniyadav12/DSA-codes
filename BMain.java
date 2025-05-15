package com.roshni.Trees;

import java.util.Scanner;

public class BMain {
      public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.populate(scanner);
        tree.prettier();
    }
}
