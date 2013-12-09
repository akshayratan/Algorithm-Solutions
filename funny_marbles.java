/**
 *
 * @author akshay_ratan
 * Copyright 2013 December Challenge
 * Problem Link: http://www.codechef.com/DEC13/problems/MARBLEGF/
 */
import java.io.*;
public class funny_marbles {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int n,q;
        String input1=obj.readLine();
        String conv[]=input1.split(" ");
        n=Integer.parseInt(conv[0]);
        q=Integer.parseInt(conv[1]);
        String inp2=obj.readLine();
        String conv2[]=inp2.split(" ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(conv2[i]);
        }
        int sum=0; 
        BufferedOutputStream bos = new BufferedOutputStream(System.out); 
        String eol = System.getProperty("line.separator"); 
        byte[] eolb = eol.getBytes() ;
        
        for(int j=0;j<q;j++)
        {
            String inp3=obj.readLine();
            String conv3[]=inp3.split(" ");
            String type=conv3[0];
            if(type.equals("S"))
            {
                for(int k=Integer.parseInt(conv3[1]);k<=Integer.parseInt(conv3[2]);k++)
                    sum=sum+arr[k];
                bos.write(new Integer(sum).toString().getBytes());
                bos.write(eolb);
                sum=0;
            }
            else if(type.equals("G")) {
                arr[Integer.parseInt(conv3[1])]= arr[Integer.parseInt(conv3[1])] + Integer.parseInt(conv3[2]);
                
            }
            else if(type.equals("T")){
                
                arr[Integer.parseInt(conv3[1])]= arr[Integer.parseInt(conv3[1])] - Integer.parseInt(conv3[2]);
                
            }
                
        }
        
        bos.flush();
    }
}
