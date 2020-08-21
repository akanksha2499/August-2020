import java.util.*;

public class YearsAndDays
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min,day,year;
		System.out.print("Input the number of minutes : ");
		min=sc.nextInt();
		day=min/(24*60);
		year=day/365;
		day=day%365;
		System.out.println(min+" minutes is aprroximately "+year+" years and "+day+" days");
	}
}
