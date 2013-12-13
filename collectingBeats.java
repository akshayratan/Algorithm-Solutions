/**
 *
 * (C)2013 Akshay Ratan
 * Codeforces Round #219 (Div2)
 * Challenge Link: http://codeforces.com/contest/373/problem/A
 */
import java.io.*;
public class collectingBeats {
    public static void main(String args[])throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int k; //No of panels possible with one hand
        k=Integer.parseInt(obj.readLine());
        char arr_input[][]=new char[4][4];
        char arr[]=new char[16];
        String input;
        int c=0;
        for(int i=0;i<4;i++)
        {
            input=obj.readLine();
            for(int j=0;j<4;j++)
            {
                arr_input[i][j]=input.charAt(j);
                if((arr_input[i][j]!='.') && (arr_input[i][j]!=' ')) {
                    arr[c]= (arr_input[i][j]);
                    c++;                    
                }
            }
        }
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int c5=0;
        int c6=0;
        int c7=0;
        int c8=0;
        int c9=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]=='1'))
                c1=c1+1;
            if((arr[i]=='2'))
                c2=c2+1;
            if((arr[i]=='3'))
                c3=c3+1;
            if((arr[i]=='4'))
                c4=c4+1;
            if((arr[i]=='5'))
                c5=c5+1;
            if((arr[i]=='6'))
                c6=c6+1;
            if((arr[i]=='7'))
                c7=c7+1;
            if((arr[i]=='8'))
                c8=c8+1;
            if((arr[i]=='9'))
                c9=c9+1;           
                
        }
        if(c1>(2*k) || c2>(2*k) || c3>(2*k) || c4>(2*k) || c5>(2*k) || c6>(2*k) || c7>(2*k) || c8>(2*k) || c9>(2*k)) {
                System.out.println("NO");
            }
            else 
            System.out.println("YES");
            }
}
