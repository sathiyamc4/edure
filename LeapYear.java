package Basic;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String args[])
	{
		int yr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");
		yr = scan.nextInt();
		if(yr%4==0)
		{
			if(yr%100==0)
			{
				if(yr%400==0)
					System.out.println("Given year is a leap year");
				else
					System.out.println("Given year is not a leap year");
			}
			else
				System.out.println("Given year is a leap year");
		}
		else
			System.out.println("Given year is not a leap year");
	}
}
