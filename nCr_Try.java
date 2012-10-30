//Binomial Coefficient Problem

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
public class nCr_try
{
	
	public static BigInteger fact(BigInteger x)
	{
		BigInteger f=BigInteger.ONE;
		for(BigInteger i=x;i.compareTo(BigInteger.ONE)>0;i=i.subtract(BigInteger.ONE))
		f=f.multiply(i);
		return f;
	}
	public static BigInteger BinoCoff(BigInteger m,BigInteger k)
	{
                BigInteger d1=fact(m.subtract(k));
       		BigInteger d=d1.multiply(fact(k));
		BigInteger ans=fact(m).divide(d);
		return ans;
	}
	public static int modulo(BigInteger bc,BigInteger p)
	{
		if(bc.remainder(p)==BigInteger.ZERO)
		return 1;
		else return 0;
	}


	public static void main(String args[])throws IOException
	{	
            BigInteger temp;
                
		int j=0,c=0;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                if(t<0 || t>100)  
                System.exit(0);
		int arr[]=new int [t];
                for(int i=0;i<t;i++)
		{
                    BigInteger n=sc.nextBigInteger(); BigInteger p=sc.nextBigInteger();
			BigInteger k;
                        for(k=BigInteger.ZERO ;k.compareTo(n)<=0;k=k.add(BigInteger.ONE))
			{
				 temp=BinoCoff(n,k);
				
                         }
		            
                            arr[j]=temp;
                    c=0;
                    j++;
		}
                for(int i=0;i<arr.length;i++)  
                System.out.println(arr[i]);
                System.gc();
                    
	}
	
}		
			





