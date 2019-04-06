
package Basic;

import java.util.Scanner;

public class ReverseNumberForLoop 
{
	public static void main(String args[])
	{
		int n,d,a,b,i=0,rev=0,pow;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		n = scan.nextInt();
		a = n;
		b = n;
		while(a>0)
		{
			a = a/10;
			i++;
		}
		pow = i;
		for(int j=0;j<i;j++)
		{
			b = n%10;
			n = n/10;
			pow--;
			rev = (int) (rev + b*Math.pow(10, pow));
		}
		System.out.println(rev);
	}
}
