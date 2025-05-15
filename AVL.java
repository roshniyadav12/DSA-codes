package com.roshni.AVL;

public class AVL {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;
        
        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public AVL(){

    }

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int value){
        root=insert(value, root);
    }
    public Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }

    
        //AVL tree
        public Node rotate(Node node){
            if(height(node.left)-height(node.right)>1){
                //left heavy
                if(height(node.left.left)-height(node.left.right)>0){
                    //ll case
                    return RotateRight(node);
                }
                if(height(node.left.left)-height(node.left.right)<0){
                    //lr case
                    node.left=leftRotate(node.left);
                    return RotateRight(node);
                }
            }
            if(height(node.right)-height(node.left)>1){
                //right heavy
                if(height(node.right.right)-height(node.right.left)>0){
                    //rr case
                    return leftRotate(node);
                }
                if(height(node.right.right)-height(node.right.left)<0){
                    //rl case
                    node.right=RotateRight(node.right);
                    return leftRotate(node);
                }
            }
            return node;
        }

        public Node RotateRight(Node p){
            Node c=p.left;
            Node t=c.right;
            c.right=p;
            p.left=t;
            p.height=Math.max(height(p.left), height(p.right))+1;
            c.height=Math.max(height(c.left), height(c.right))+1;
            return c;
        }
        public Node leftRotate(Node c){
            Node p=c.right;
            Node t=p.left;
            p.left=c;
            c.right=t;
            
            p.height=Math.max(height(p.left), height(p.right))+1;
            c.height=Math.max(height(c.left), height(c.right))+1;
            return p;
        }




    public void populate(int[] nums){
        for(int i=0; i<nums.length; i++){
            this.insert(nums[i]);
        }
    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        display(root,"Root Node: ");
    }
    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+ node.value);
        display(node.left, "Left child of "+ node.value + " : ");
        display(node.right, "Right child of "+ node.value + " : ");
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    public void populateSorted(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }
    public void PreOrder(){
        PreOrder(root);
    }
    public void PreOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void InOrder(){
        InOrder(root);
    }
    public void InOrder(Node node){
        if(node==null){
            return;
        }
        InOrder(node.left);
        System.out.println(node.value+" ");
        InOrder(node.right);
    }

    public void PostOrder(){
        PostOrder(root);
    }
    public void PostOrder(Node node){
        if(node==null){
            return;
        }
        PostOrder(node.left);
      
        PostOrder(node.right);
        System.out.println(node.value+" ");
    }
}
