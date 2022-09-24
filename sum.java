class sum
{
 public static void main(String args[])
 {
  int n=1234,d,r,s=0;
  r=n%10;
  d=n/10;
  s=s+r;
  
  r=d%10;
  d=d/10;
  s=s+r;
  
  r=d%10;
  d=d/10;
  s=s+r;
  
  r=d%10;
  d=d/10;
  s=s+r;
  
 
 
  
  System.out.println("sum of four digits of a four digit number is"+s);
  }
  }