import java.util.*;
class so
{
 public static void main(String args[])
 {
  int x,s=0,p,q,m,n,d,r;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a4 digit number");
  x=sc.nextInt();
   r=x%10;
   d=x/10;
  p=(r%2!=0)?r:0;
   s=s+p;
   r=d%10;
   d=d/10;
  q=(r%2!=0)?r:0; 
   s=s+q;
   r=d%10;
   d=d/10;
  m=(r%2!=0)?r:0;
   s=s+m;
   r=d%10;
   d=d/10;
  n=(r%2!=0)?r:0; 
   s=s+n;
   System.out.println("sum of odd numbers of a 4 digit number is"+s);
   }
  } 