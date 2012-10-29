//4th Question in CodeSprint 3
//Author Akshay Ratan
//import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;
public class nCr
{
    static int t;
     static int cnt=0;
    static int arr[]=new int[100000];
    static BigInteger ans=BigInteger.ZERO;
    public static void main(String args[])
    {
        //BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        BigInteger n,r;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt(); //test cases
        /*if(t<1||t>100000)
            System.exit(0); */
        for(int i=0;i<t;i++)
        {
            //n=Integer.parseInt(obj.readLine()); r=Integer.parseInt(obj.readLine());
            n=sc.nextBigInteger();r=sc.nextBigInteger();
           /* String input=obj.readLine();
             String[] values = input.split(" ");
             n = Integer.valueOf(values[0]);
             r = Integer.valueOf(values[1]); */
           /* if(n<1||n>1000000000||r<0||r>n)
                System.exit(0); */
            working(n,r);
            //System.out.println(ans);
            
        }
        
        for(int i=0;i<t;i++)
            System.out.println(arr[i]);
        
    }
    public static void working(BigInteger x,BigInteger y)
    {
        BigInteger d=x.subtract(y);
    //    BigInteger num=facto(x);
      //  BigInteger denom1=facto(y);
        //BigInteger denom2=facto(d);
        //BigInteger denom=denom1.multiply(denom2);
        //BigInteger ans_raw=num.divide(denom);
        //ans=ans_raw.remainder(BigInteger.valueOf(142857));
        BigInteger num=stirling(x);
        //BigInteger ans_raw=num.divide(denom);
        //ans=ans_raw.remainder(BigInteger.valueOf(142857));
    array(num,t);
        //array(ans,t);
    }
    
    public static void array(BigInteger a,int size)
    {
        //int anss=a.intValue();
        arr[cnt]=a.intValue();
         cnt=cnt+1; 
    }
   
   public static BigInteger facto(BigInteger x)
	{
                
		BigInteger f=BigInteger.ONE;
		for(BigInteger i=x;i.compareTo(BigInteger.ONE)>0;i=i.subtract(BigInteger.ONE))
		f=f.multiply(i);
		return f;
	}
   public static BigInteger stirling(BigInteger x)
   {
       long cc=(long)Math.PI;
       long c2=2;
        BigInteger x1=x.valueOf(c2).multiply((x.valueOf(cc)));
        BigInteger x2=x1.multiply(x);   //ab tak did 2 pi n
        //long xsqrt=(long)Math.sqrt(xn);
      // BigInteger x1=BigInteger.valueOf(2)*BigInteger.valueOf(Math.PI)*BigInteger.valueOf(xsqrt);
       BigDecimal r=root(x2);
       BigInteger rr=r.toBigInteger();
       BigInteger e=BigInteger.valueOf((long)Math.E);
       BigInteger x3=x.divide(e);
       BigInteger power=pow(x3,x);
       BigInteger finalAns=rr.multiply(power);
       return finalAns;
       
   }
       public static BigDecimal root(BigInteger my2P100000) {
       
                nCr SquareRootOfBigIntegerExample = new nCr();
                String n = "";
                   
                MathContext mc =  new MathContext(0, RoundingMode.DOWN);
                mc = MathContext.DECIMAL32;
 
              //  BigInteger my2P100000  = new BigInteger("0");
                BigInteger two      = new BigInteger("2");
                BigInteger one      = new BigInteger("1");
               
                //my2P100000  = two.shiftLeft(2000 - 1);
                       
            /*    System.out.println("2^2000 --  Step 1");
                System.out.println("Value of 2^2,000 " + my2P100000  );
                System.out.println("");
                System.out.println("Finding the Square Root of 2^2000");
              */                 
               
                String mys =  my2P100000  + "";
                n = (mys) ;
                int firsttime = 0;
               
                BigDecimal myNumber = new BigDecimal(n);
                BigDecimal g = new BigDecimal("1");
                BigDecimal my2 = new BigDecimal("2");
                BigDecimal epsilon = new BigDecimal("0.0000000001");
       
                BigDecimal nByg = myNumber.divide(g, 9, BigDecimal.ROUND_FLOOR);
               
                //Get the value of n/g
                BigDecimal nBygPlusg = nByg.add(g);
               
                //Get the value of "n/g + g
                BigDecimal nBygPlusgHalf =  nBygPlusg.divide(my2, 9, BigDecimal.ROUND_FLOOR);
               
                //Get the value of (n/g + g)/2
                BigDecimal  saveg = nBygPlusgHalf;
                firsttime = 99;
               
                do
                {
                        g = nBygPlusgHalf;
                        nByg = myNumber.divide(g, 9, BigDecimal.ROUND_FLOOR);
                        nBygPlusg = nByg.add(g);
                        nBygPlusgHalf =  nBygPlusg.divide(my2, 9, BigDecimal.ROUND_FLOOR);
                        BigDecimal  savegdiff  = saveg.subtract(nBygPlusgHalf);
                           
                        if (savegdiff.compareTo(epsilon) == -1 )
                        {
                            firsttime = 0;
                        }
                        else
                        {
                            saveg = nBygPlusgHalf;
                        }
                       
                } while (firsttime > 1);
                System.out.println(saveg);
                return saveg;
   }
       
       public static BigInteger pow(BigInteger x, BigInteger y) {  
  if (y.compareTo(BigInteger.ZERO) < 0)  
    throw new IllegalArgumentException();  
  BigInteger z = x; // z will successively become x^2, x^4, x^8, x^16, x^32...  
  BigInteger result = BigInteger.ONE;  
  byte[] bytes = y.toByteArray();  
  for (int i = bytes.length - 1; i >= 0; i--) {  
    byte bits = bytes[i];  
    for (int j = 0; j < 8; j++) {  
      if ((bits & 1) != 0)  
        result = result.multiply(z);  
      // short cut out if there are no more bits to handle:  
      if ((bits >>= 1) == 0 && i == 0)  
        return result;  
      z = z.multiply(z);  
    }  
  }  
  return result;  
}  
}

