/* WAP to check if a string is a palindrome or not using inbuilt functions. */

import java.util.Scanner;

class PalindromeOfString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string : ");
		String s=sc.nextLine();

		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();

		String rev=sb.toString();

		if(s.compareTo(rev)==0)
		{
			System.out.println("String "+s+" is palindrome");
		}
		else
		{
			System.out.println("String "+s+" is not palindrome");
		}

	}
}