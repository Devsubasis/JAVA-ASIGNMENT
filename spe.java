import java.util.*;
class spe
{
  public static void main(String args[])
  {
    int x,r,d,s=0,r1,r2,r3,r4,r5,r6,r7;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a 4 digit number");
	x=sc.nextInt();
	r=x%10;
	d=x/10;
   r1=r;
	r=d%10;
	d=d/10;
   r2=r;
	r=d%10;
	d=d/10;
   r3=r;
	r=d%10;
	d=d/10;
   r4=r;
	r5=((r1%2==0)&&(r2%2==0))?r1*r2:0;
	s=s+r5;
	r6=((r2%2==0)&&(r3%2==0))?r2*r3:0;
	 s=s+r6;
	r7=((r3%2==0)&&(r4%2==0))?r3*r4:0;
	 s=s+r7;
	System.out.println("sum of product of even digit of 4 digit number is"+s);
	
  }
} 