/*
 * This Program is to check whether a given tree is a Binary search tree or not
 */

/**
 *
 * @author Akshay
 */
 
import java.util.*;
public class checkBST {
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data, Node left,Node right)
        {
            this.left=left;
            this.right=right;
            this.data=data;
        }
    }
    
    static ArrayList<Integer> arr=new ArrayList<Integer>();
    public static void inorder(Node root)
    {
        if(root!=null)
        {
            if(root.left!=null)
                inorder(root.left);
            arr.add(root.data);
            if(root.right!=null)
                inorder(root.right);
            
        }
    }
    
    public static void check(Node root)
    {
        if(root==null){
            System.out.println("Empty Tree");
            
        }
        
        inorder(root);
        boolean flag=true;
        for(int i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i)>arr.get(i+1))
            {
             flag=false;
             break;
            }
        }
        if(flag==true)
            System.out.println("Binary Search Tree");
        else
            System.out.println("Not a Binary Search Tree");
               
    }
    
     public static void main(final String[] args) {
     
         
         final Node four,eight,six,twelve,sixteen,fourteen,ten;
         four=new Node(4,null,null);
         eight=new Node(8,null,null);
         six=new Node(6,four, eight);
         twelve= new Node(12,null,null);
         sixteen=new Node(16,null,null);
         fourteen=new Node(14,twelve,sixteen);
         ten=new Node(10,six,fourteen);
    
         check(ten);
}
}
