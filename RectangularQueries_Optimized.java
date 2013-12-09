/**
 *
 * @author Akshay Ratan 
 * @Copyright December Challenge 2013 
 * Problem Link: http://www.codechef.com/DEC13/problems/RECTQUER
 */
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class RectangularQueries_Optimized {
    public static void main(String args[])throws IOException
    {
        int n;
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(obj.readLine());
        int arr[][]= new int[n][n];
        String input;
        for(int i=0;i<n;i++)
        {
            input=obj.readLine();
            String line[]= input.split(" ");
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Integer.parseInt(line[j]);
                input=null;
                
            }
        }  
        int q = Integer.parseInt(obj.readLine()); //queries
        int x1,y1,x2,y2;
        for(int k=0;k<q;k++) {
        String inp2;
        inp2=obj.readLine();
        String line2[]=inp2.split(" ");
        x1=Integer.parseInt(line2[0]);
        y1=Integer.parseInt(line2[1]);
        x2=Integer.parseInt(line2[2]);
        y2=Integer.parseInt(line2[3]);
        
       // ArrayList<Integer> final_arr = new ArrayList<Integer>();
        Set <Integer> set = new HashSet<Integer>();
        for(int i=(x1-1);i<=(x2-1);i++)
        {
            for(int j=(y1-1);j<=(y2-1);j++)
            {
                /*if(!final_arr.contains(arr[i][j]))
                final_arr.add(arr[i][j]);*/
                set.add(arr[i][j]);
            }
        }
        //int size=final_arr.size();
 //       System.out.println(final_arr);
        int size=set.size();
        System.out.println(size);
        }
        
        }   
    }

