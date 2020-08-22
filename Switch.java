import java.util.*;

public class Switch
{
	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick one : \n1) Hi\n2)Hey\n3)Hello");
		choice=sc.nextInt();
		switch(choice)
		 {
		     case 1:
		         System.out.println("You said Hi");
		         break;
		     case 2:
		         System.out.println("You said Hey");
		         break;
		     case 3:
		         System.out.println("You said Hello");
		         break;
		     default:
		         System.out.println("Invalid Choice");
		 }
	}
}
