import java.util.*;
class bw
{
  public static void main(String args[])
  {
   int x,r1,r2,r3,r4,d,s;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a 4 digit number");
   x=sc.nextInt();
   r1=x%10;
   d=x/10;
   r2=d%10;
   d=d/10;
   r3=d%10;
   d=d/10;
   r4=d%10;
   d=d/10;
    System.out.println("2nd digit of a 4digit number is"+r2);
	System.out.println("4th digit of a 4digit number is"+r4);
	s1=(r2&r4);
	System.out.println("result of bitwise and operator is"+s1);
	s2=(r2|r4);
	System.out.println("result of bitwise or operator is"+s2);
	s3=(r2^r4);
	System.out.println("result of bitwise xor operator is"+s3);
    
	}
	
	}