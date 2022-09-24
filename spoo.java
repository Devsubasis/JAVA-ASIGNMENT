import java.util.*;
class spoo
{
  public static void main(String args[])
  {
    int x,r,d,se=0,so=0,r1,r2,r3,r4,r5,r6,r7,r8,r9,r12,r11,r10,diff=0;
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
	r5=((r1%2==0)&&((r1!=2)&&(r1!=6)))?r1:0;
	r6=((r2%2==0)&&((r2!=2)&&(r2!=6)))?r2:0;
	se=se+(r5*r6);
	r7=((r3%2==0)&&((r3!=2)&&(r3!=6)))?r3:0;
	r8=((r4%2==0)&&((r4!=2)&&(r4!=6)))?r4:0;
	 se=se+(r8*r7);
	System.out.println("sum of product of even digit except 2 and 6 of any 4 digit number is"+se);
	r9=((r1%2!=0)&&((r1!=3)&&(r1!=7)))?r1:0;
	r10=((r2%2!=0)&&((r2!=3)&&(r2!=7)))?r2:0;
	so=so+(r9*r10);
	r11=((r3%2!=0)&&((r3!=3)&&(r3!=7)))?r3:0;
	r12=((r4%2!=0)&&((r4!=3)&&(r4!=7)))?r4:0;
	 so=so+(r12*r11);
	 System.out.println("sum of product of odd digit except 3 and 7 of any 4 digit number is"+so);
	 diff=se-so;
	  System.out.println("difference is"+diff);
	 
	
  }
} 