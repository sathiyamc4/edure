package Basic;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String args[])
	{
		/*Scanner scan = new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str = scan.nextLine();
		StringBuffer strb = new StringBuffer(str);
		String strrev =new String(strb.reverse());
		if(str.equals(strrev))
			System.out.println("Given String is a palindrome");
		else
			System.out.println("Given String is not a palindrome");*/
		palin("mayam123");
		palindrom("malayalam");
	}
	
	
	static void palin(String str)
	{
		char ch[] =str.toCharArray();
		int n=ch.length,j = 0;
		System.out.println(n);
		for(int i=n-1;i>=0;i--)
		{
			ch[j]=str.charAt(i);
			j++;
		}
		String str1 = String.valueOf(ch);
		if(str.equalsIgnoreCase(str1))
			System.out.println("Given string is a palindrome");
		else
			System.out.println("Given string is not a palindrome");
	}
	
	static void palindrom(String str)
	{
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--)
			reverse = reverse+str.charAt(i);
		if(str.equalsIgnoreCase(reverse))
			System.out.println("Given string is a palindrome");
		else
			System.out.println("Given string is not a palindrome");
	}
	
}
