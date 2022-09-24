import java.util.*;
class eo
{
 public static void main(String args[])throws Exception
 {
  int x,s=0,p,q,m,n,d,r,u,v,w,e,f,g,h,k=0,l,c=0,z,r1,d1;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a 4 digit number");
  x=sc.nextInt();
   r=x%10;
   d=x/10;
  p=((r%2==0)&&(r/4!=0))?r:0;
   s=s+p;
   l=((r%2==0)&&(r/4!=0))?1:0;
   k=k+l;
   r=d%10;
   d=d/10;
  q=((r%2==0)&&(r/4!=0))?r:0; 
   s=s+q;
  l=((r%2==0)&&(r/4!=0))?1:0;
  k=k+l;
   r=d%10;
   d=d/10;
  m=((r%2==0)&&(r/4!=0))?r:0;
   s=s+m;
  l=((r%2==0)&&(r/4!=0))?1:0;
  k=k+l;
   r=d%10;
   d=d/10;
  n=((r%2==0)&&(r/4!=0))?r:0;
   s=s+n;
   l=((r%2==0)&&(r/4!=0))?1:0;
   k=k+l;
   u=s/l;
   System.out.println(u);
   
   r1=x%10;
   d1=x/10;
  e=((r1%2!=0)&&(r1/3!=0))?r1:0;
   s=s+e;
   z=((r1%2!=0)&&(r1/3!=0))?1:0;
   c=c+z;
   r1=d1%10;
   d1=d1/10;
  f=((r1%2!=0)&&(r1/3!=0))?r1:0; 
   s=s+f;
  z=((r1%2!=0)&&(r1/3!=0))?1:0;
  c=c+z;
   r1=d1%10;
   d1=d1/10;
  g=((r1%2==0)&&(r1/3!=0))?r1:0;
   s=s+g;
  z=((r1%2!=0)&&(r1/3!=0))?1:0;
  c=c+z;
   r1=d1%10;
   d1=d1/10;
  h=((r1%2!=0)&&(r1/3!=0))?r1:0;
   s=s+h;
   z=((r1%2!=0)&&(r1/3!=0))?1:0;
   c=c+z;
   v=s/c;
   
   w=u+v;
   
   System.out.println("sum of odd numbers of a 4 digit number and even numbers of a 4 digit number is"+w);
   }
  } 