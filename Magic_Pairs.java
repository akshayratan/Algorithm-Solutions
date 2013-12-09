/**
 *
 * @author Akshay Ratan 2013 
 * Codechef Problem : Magic Pairs in December Challenge 2013
 * Problem Link: http://www.codechef.com/DEC13/problems/ALEXNUMB
 */

import java.io.*;
public class Magic_Pairs {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int test= Integer.parseInt(obj.readLine());
        long n;
        long ans=0;
        for(int i=0;i<test;i++)
        {
            n=Long.parseLong(obj.readLine());
            if (n<1)
                break;
            String input = obj.readLine();
            ans= (n*(n-1))/2;
            System.out.println(ans);
        }
    }
    
}
