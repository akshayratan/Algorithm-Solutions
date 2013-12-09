//Save humanity

import java.io.*;
public class DNATry
{
     static int k=0;
     static int arr[];
    public static int funcdiff(String a,String b)
    {
        int c=0;
        for(int i=0;i<b.length();i++)
                if(a.charAt(i)!=b.charAt(i))
                c++;
        return c;
    }
       public static void main(String args[])throws IOException
       {
           int []copy[]=null;
           int cnt=0;
           int f=0;
           String p,v;
           String str=new String();
           BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
           int t=Integer.parseInt(obj.readLine());
           if(t<1 || t>10)
               System.exit(0);
          
           for(int i=0;i<t;i++)
           {    
               int j=0,k=0;
               p=obj.readLine();
               v=obj.readLine();
               System.out.println();
               int l=v.length();
               int n=p.length();
               int arr[]=new int[p.length()];
               while(j+l<n)
               {
                   str=p.substring(j,j+l);
                   if(funcdiff(str,v)==0||funcdiff(str,v)==1)
                   {
                       arr[k]=j;
                       k++;
                   }
                   j++;                                                        
               }   
               int[] store[]=new int[k][10];
               store[i]=arr;
               copy=store;
           }
           for(int m=0;m<copy.length;m++)
           {
               System.out.println(copy[m]);
           }
}
}