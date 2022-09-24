import java.util.*;
class value
{
 public static void main(String args[])
 {
  int x,d,r,p;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number");
  x=sc.nextInt();
  r=x%10;
  d=x/10;
  p=r*1;
  System.out.println("face value of 1st digit is"+r);
  System.out.println("position value of 1st value is "+p);
  r=d%10;
  d=d/10;
  p=r*10;
  System.out.println("face value of 2nd digit is"+r);
  System.out.println("position value of 2nd value is "+p);
  r=d%10;
  d=d/10;
  p=r*100;
   System.out.println("face value of 3rd digit is"+r);
  System.out.println("position value of 3rd value is "+p);
  r=d%10;
  d=d/1000;
     System.out.println("face value of 4th digit is"+r);
  System.out.println("position value of 4th value is "+p);
  }
  }