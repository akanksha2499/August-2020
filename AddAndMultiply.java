public class AddAndMultiply
{
  public static void main (String[]args)
  {
    int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
    int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
    int c[][]=sum(a,b);
    System.out.println("The sum of two matrix is :");
    display(c);
    System.out.println("\nThe product of two matrix is :");
    int d[][]=prod(a,b);
    display(d);
  }
  static int[][] sum(int a[][],int b[][])
  {
    int i,j,sum[][] = new int[a.length][b.length];
    for(i=0;i<a.length;i++)
       for(j=0;j<b.length;j++)
          sum[i][j]=a[i][j]+b[i][j];
          
    return sum;
  }
  static int[][] prod(int a[][],int b[][])
  {
    int i,j,k,prod[][]=new int[a.length][b.length];
    for(i=0;i<a.length;i++)
     for(j=0;j<b.length;j++)
     {
        prod[i][j]=0;
        for(k=0;k<a.length;k++)
           prod[i][j]+=a[i][k]*b[k][j];
     }
    return prod;
  }
  static void display(int arr[][])
  {
    int i,j;
    for(i=0;i<arr.length;i++)
    {
     for(j=0;j<arr.length;j++)
     {
        System.out.print(arr[i][j]+"\t");
     }
     System.out.println();
    }
  }
  
}
