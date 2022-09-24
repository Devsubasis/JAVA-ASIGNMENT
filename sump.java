import java.util.*;
class sump
{
 public static void main(String args[])
 {
   int x,y,d1,d2,r1,r2,r3,r4,R1,R2,R3,R4,s;
   Scanner sc=new Scanner(System.in);
   System.out.println("identifying 1st number");
   System.out.println("enter 1st number");
   x=sc.nextInt();
   r1=x%10;
   d1=x/10;
   r2=d1%10;
   d1=d1/10;
   r3=d1%10;
   d1=d1/10;
   r4=d1%10;
   d1=d1/10;
   System.out.println("identifying 2nd number");
   System.out.println("enter 2nd number");
   y=sc.nextInt();
   R1=y%10;
   d2=y/10;
   R2=d2%10;
   d2=d2/10;
   R3=d2%10;
   d2=d2/10;
   R4=d2%10;
   d2=d2/10;
   s=(R4*r4)+(R3*r3)+(R2*r2)+(R1*r1);
   System.out.println("sum of product od 2 four digit numbers is"+s);
	  }
	 } 
   