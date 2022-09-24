import java.util.*;
class speo
{
  public static void main(String args[])
  {
    int x,y,s=0,r1,r2,r3,r4,r5,r6,r7,r8,e1,e2,e3,e4,d;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a 4 digit number");
	x=sc.nextInt();
	System.out.println("enter another 4 digit number");
	y=sc.nextInt();
	
	r1=x%10;
	d=x/10;
	r2=d%10;
	d=d/10;
	r3=d%10;
	d=d/10;
	r4=d%10;
	d=d/10;
	
	r5=y%10;
	d=y/10;
	r6=d%10;
	d=d/10;
	r7=d%10;
	d=d/10;
	r8=d%10;
	e1=((r1%2==0)&&(r5%2!=0))?(r1*r5):0;
	s=s+e1;
	e2=((r2%2==0)&&(r6%2!=0))?(r2*r6):0;
    s=s+e2;
    e3=((r3%2==0)&&(r7%2!=0))?(r3*r7):0;
	s=s+e3;
	e4=((r4%2==0)&&(r8%2!=0))?(r4*r8):0;
    s=s+e4;
    	System.out.println("sum of product of corresponding even and odd digit is"+s);
  }
  
}