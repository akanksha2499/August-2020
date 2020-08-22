import java.util.*;

public class Employee
{
  String name;
  int yoj;
  int sal;
  String addr;
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Employee[] arr = new Employee[3];
    for(int i=0;i<arr.length;i++)
       {
           System.out.println("Enter details of Employee indexed "+i+1);
           System.out.print("Enter name : ");
           arr[i].name=sc.nextLine();
           System.out.print("Enter year of joining : ");
           arr[i].yoj=sc.nextInt();
           System.out.print("Enter salary : ");
           arr[i].sal=sc.nextInt();
           System.out.print("Enter Address : ");
           arr[i].addr=sc.nextLine();
       }
    
    System.out.println("\nName\tYear of joining\tSalary\tAddress");
    for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i].name+"\t"+arr[i].yoj+"\t"+arr[i].sal+"\t"+arr[i].addr+"\n");
           
       }
  }
  
}
