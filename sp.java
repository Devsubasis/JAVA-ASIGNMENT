import java.util.*;
class sp
{
  public static void main(String args[])
  {
    int x,d,r1,r2,r3,r4,r5;
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
	r5=(r1*r2)+(r2*r3)+(r3*r4);
	System.out.println("sum of product of a 4 digit number is"+r5);
  }
} 