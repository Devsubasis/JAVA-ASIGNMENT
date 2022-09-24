/*write a program to find even or odd*/

import java.util.*;
class E1
{
  public static void main(String arg[])
{
   int n;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number");
   n=sc.nextInt();
   if(n%2==0)
     System.out.println("prime no"+n);
   else 
     System.out.println("odd"+n);
}
}