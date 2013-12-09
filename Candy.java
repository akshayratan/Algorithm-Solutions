/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akshay
 */
import java.io.*;
import java.util.Scanner;
public class Candy {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);       
        int n=sc.nextInt();
        int arr[][]=new int[2][n];
        for(int i=0;i<n;i++)
        {
            arr[0][i]=sc.nextInt();
            arr[1][i]=0;
        }
        int s=0;
        if(arr[0][0]>arr[0][1])
        {
            arr[1][0]=1;
        }
        else
            arr[1][0]=0;
        if(arr[0][1]>arr[0][0])
            arr[1][1]=1+arr[1][0];
        
        for(int i=1;i<n-2;i++)
        {
            if(arr[0][i+1]>arr[0][i])
                arr[1][i+1]=1+arr[1][i];
            else if (arr[0][i+1]>arr[0][i+2])
                arr[1][i+1]=1+arr[1][i+2];
            else
                arr[1][i+1]=0;
        }
        if(arr[0][n-1]>arr[0][n-2])
            arr[1][n-1]=1+arr[1][n-2];
            
        for(int i=0;i<n;i++)
            s=s+arr[1][i];
        System.out.println(s+n);
    }
}
