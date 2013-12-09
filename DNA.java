//Save humanity

import java.io.*;
public class DNA
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
               p=obj.readLine();
               v=obj.readLine();
               System.out.println();
               int l=v.length();
               int n=p.length();
               //int arr[]=new int[p.length()];
               for(int j=0;j<n;j++){
                   while((j+l<p.length()))
                   str=p.substring(j,j+l);
                   if(funcdiff(str,v)==0||funcdiff(str,v)==1)
                   {
                       f=1;
                       cnt++;
                   }
                   else
                       f=0;
                   if(f==1)
                       flag(j,cnt,p);
                       /*  cnt++;
               //int arr[]=new int[cnt];
               //for(int k=0;k<cnt;k++)
                          arr[k]=i;
                          k++; */              
                       }
               
           }
           display(cnt);
       }
       public static void flag(int j,int count,String p)
       {
           int arr[]=new int[p.length()];
           arr[k]=j;
           k++;
           
           
       }
       public static void display(int count)
       {
           //int i=0;
           for(int i=0;i<count;i++)
           {
               System.out.print(arr[i]+" ");
           }
           
           }
}
