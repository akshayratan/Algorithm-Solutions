
/**
 *
 * @author Akshay
 */
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ChangingBit {
 static Scanner sc = new Scanner(System.in);
 static int N, Q;   
 //static int k=0;
 static char ans[]=new char[Q];
 public static void main(String args[]) throws IOException {
        
        N = sc.nextInt(); Q = sc.nextInt();
        int A[] = new int[N];
         int B[] = new int[N];
         String s1=sc.next();
         String s2=sc.next();
        for (int i = 0; i < N; i++) {
            A[i] = Character.getNumericValue(s1.charAt(i));
        }
        for (int i = 0; i < N; i++) {
         B[i] = Character.getNumericValue(s2.charAt(i));
        }
        /*System.out.println("CHECK!!");
        System.out.println("N=" +N +" " + "Q="+Q);
        for (int i = 0; i < N; i++) {
         System.out.print(A[i]);
         } */
        for(int f=0;f<Q;f++)
        {
        String ch;
        ch = sc.next();
        if( "set_a".equals(ch))
           A=set(A);
        else if("set_b".equals(ch))
            B=set(B);
        else if("get_c".equals(ch))
        {
            get(A,B);
           
        }
        }
        /*for(int m=0;m<arr.length;m++)
        System.out.println(ans[m]);
        */
    }
    public static int[] set(int arr[])
    {
        int idx,x;
        idx=sc.nextInt(); x=sc.nextInt();
        arr[N-idx-1]=x;
        return arr;
                
    }
    public static String add(int arr1[],int arr2[])
    {
        int arr[]=new int[arr1.length+1];
        int c=0,s=0;
        String s1=arr1.toString();
        String s2=arr2.toString();
       System.out.println(s1);
        int l=s1.length();
        for(int i=l-1;i>=0;i--)
        {
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            int n1=Character.getNumericValue(c1);
            int n2=Character.getNumericValue(c2);
            s=c+n1+n2;
            if(s==1)
            {
                arr[i+1]=1;
                c=0;
            }
              if(s==2)
            {
                arr[i+1]=0;
                c=1;
            }
            if(s==3)
            {
                arr[i+1]=1;
                c=1;
            }
        }
        arr[0]=c;
        String an=arr.toString();
        return an;
    }
    public static void get(int A[],int B[])
    {
        int idx;
        int k=0;
        idx=sc.nextInt();
        //int d=a.length()+b.length();\
        String c;
        c=add(A,B);
        System.out.println(c);
         char chr=c.charAt(N-idx);
       // char arr[]=new char[Q];
        //ans[k]=chr;
       // k++;*/
         System.out.println(chr);
       
        
       }
}
