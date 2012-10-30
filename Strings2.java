//Interview Street problem

import java.io.*;
public class Strings2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		int t; //test cases
		t=Integer.parseInt(obj.readLine());
                if(t<1 || t>10)
                       System.exit(0);
		//String arr[]=new String[t];
		int c=0; //counter
		int l;
		String s;
		for(int i=0;i<t;i++)
		{	
			s=obj.readLine();
                        s=s.toLowerCase();
			l=s.length();
			String arr2[]=new String[l+1];
			int x=0;
			for(int j=x;j<l;j++)
			{
				arr2[j]=s.substring(x,l);
				x++;
			}
			//System.out.println(arr2[1].charAt(0));
			//int f=0;
			
			for(int f=0;f<l;f++)
			{
			for(int k=0;k<(arr2[f].length());k++)
			{	
				//int j=0;
				//while(arr2[j].charAt(k))
				//{
				//System.out.println(arr2[f].charAt(k));
				if(s.charAt(k)==arr2[f].charAt(k))
				c++;
				else			
				break;							
			}	
			}
		System.out.println(c);
                c=0;
                System.gc();
		}
	}
}
