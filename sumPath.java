/**
 *
 * @author Akshay Ratan
 */
 
/* Given a binary tree and a number, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals the given number. Return false if no such path can be found 

Problem and test case has been picked up from GeeksforGeeks Portal.
Link: http://www.geeksforgeeks.org/root-to-leaf-path-sum-equal-to-a-given-number/   
*/

public class PathSum {
    static class Node{
        int data;
        Node left;
        Node right;
            public Node(final int data,final Node left,final Node right)
            {
                this.data=data;
                this.left=left;
                this.right=right;
                
            }
    }
    
     public static void main(final String[] args) {
     
         int sum=21;
         final Node eight,ten,three,five,two,two2;
         
         three=new Node(3,null,null);
         five=new Node(5,null,null);
         eight=new Node(8,three, five);
         two2= new Node(2,null,null);
         two=new Node(2,two2,null);
         ten=new Node(10,eight,two);
         
         if(isSum(ten,sum))
             System.out.println("Root to path leaf with sum="+sum);
         else
             System.out.println("NO");
     }
     
     public static boolean isSum(final Node node,final int sum)
     {
         if(node==null)
             return (sum==0);
         
     else
     {
         boolean ans=false;
         final int subSum=sum-node.data;
         return (isSum(node.left,subSum)||isSum(node.right,subSum));
         
     }
     
}
    
}
