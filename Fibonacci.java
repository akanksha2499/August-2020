import java.util.*;

public class Fibonacci
{
  static int i=3;
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n,a=0,b=1;
    System.out.print("Enter the number of terms for fibbonacci series : ");
    n=sc.nextInt();
    System.out.println("The required series is :");
    System.out.print(a+","+b+",");
    fib(a,b,n);
  }
  
  static void fib(int a,int b,int n)
  {
    if(i<=n)
    {
      int sum=0;
      sum+=a+b;
      System.out.print(sum+",");
      i++;
      fib(b,sum,n);
    }

  }
 
}
