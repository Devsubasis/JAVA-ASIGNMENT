import java.util.*;
class shift
{
 public static void main(String args[])
 {
  int x,r1,r2,r3,r4,m,n,p,d,s;
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
  s=r1+r2+r3+r4;
   System.out.println("sum of numbers are"+s);
   m=s>>r3;
   n=s<<r3;
   p=s>>>r3;
   System.out.println("leftshift result is"+m);
   System.out.println("right shift result is"+n);
   System.out.println("zero shift result is"+p);
   }
  } 
  
  