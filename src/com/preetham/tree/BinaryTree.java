package com.preetham.tree;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
public class BinaryTree {
    Node root;
    public void insert(int data){
        root= inorderRec(root,data);
    }
    public Node inorderRec(Node root, int data){
        if(root==null)
        {
           root=new Node(data);
        }
        else if (data<root.data)
        {
            root.left=inorderRec(root.left, data);
        }
        else if (data>root.data)
        {
            root.right=inorderRec(root.right, data);
        }
        return root;
    }
    public void inorder(){
        inorderRec(root);
    }
    public void inorderRec(Node root){
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
        }
    }
