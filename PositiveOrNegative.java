package Basic;

import java.util.Scanner;

public class PositiveOrNegative 
{
	public static void main(String args[])
	{
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		n = scan.nextInt();
		if(n>0.0)
			System.out.println("Giver number is a positive number");
		else if(n<0)
			System.out.println("Givern number is a negative number");
		else
			System.out.println("Given number is 0");
	}
}
