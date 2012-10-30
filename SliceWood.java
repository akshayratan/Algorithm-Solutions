
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akshay
 */
import java.math.BigInteger;
import java.util.*;
 class SliceWood {
     static int n,k;
     static int ans=0;
  public static void main(String args[])throws IOException
  {
      Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       k=sc.nextInt();
      int arr[]=new int[n];
      //ans=0;
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
         // if(arr[i]==10)
           //   ans++;
      }
      int cut=0;
      
      for(int i=0;i<n;i++)
      {
      if(cut<=k)
      {
          if(arr[i]>=10)
          {
              check(arr);
              
          }
      }
  }
      System.out.println(ans);
}
  public static void check(int arr[])
  {
      for(int j=0;j<n;j++)
      {
          arr[j]=arr[j]-10;
          ans++;
          
      }
      
  }
}
