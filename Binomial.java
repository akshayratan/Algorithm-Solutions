//Binomial Coefficient Problem

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.StringTokenizer;
public class Binomial
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
                
		BigInteger c=BigInteger.ZERO; // counter
                int j=0;
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
                BigInteger t=sc.nextBigInteger(); // test cases
                //int t=sc.nextInt();
                if(t.compareTo(new BigInteger("100"))==1 || t.compareTo((BigInteger.ZERO))<0)
                    System.exit(0);
		ArrayList<BigInteger> arr=new ArrayList<BigInteger>();
                //String[] input = new String[2];
                for(BigInteger i=BigInteger.ZERO;i.compareTo(t)<0;i=i.add(BigInteger.ONE))
		{
                    /*input = obj.readLine().split(" ");
                    int n = Integer.parseInt(input[0]);
                    int p= Integer.parseInt(input[1]); */
                    BigInteger n=sc.nextBigInteger(); BigInteger p=sc.nextBigInteger();
			BigInteger k;
                        for(k=BigInteger.ZERO ;k.compareTo(n)<=0;k=k.add(BigInteger.ONE))
			{
				BigInteger temp=BinoCoff(n,k);
				if(modulo(temp,p)==1)
				c=c.add(BigInteger.ONE);
			}
		//System.out.println(c);
                            
                            arr.add(c);
                    c=BigInteger.ZERO;
                    j++;
		}
                //BigInteger si=new BigInteger("arr.size()");
                for(BigInteger u=BigInteger.ZERO;u.compareTo(t)<0;u=u.add(BigInteger.ONE))
                    //System.out.println(arr);
                    System.out.println(arr.toArray());
                    
	}
	
}		
			





