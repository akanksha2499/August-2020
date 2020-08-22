import java.util.*;

public class Prime
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println ("Enter a number :");
    n=sc.nextInt();
    if(check(n)==1)
      System.out.println(n+" is a prime number");
    else
      System.out.println(n+" is not a prime number");
  }
  
  static int check(int n)
  {
    int i,count=0;
    for(i=2;i<=n/2;i++)
       if(n%i==0)
        count++;
        
    if(count==0)
       return 1;
    else
       return 0;
  }
  
}
