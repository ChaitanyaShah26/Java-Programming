/* WAP to count the frequency of occurrence of a given character in a given line of text. */

import java.util.Scanner;

class CharFreq
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str=sc.nextLine();

		int freq=0;
		System.out.println("Enter character to check frequency : ");
		char ch=sc.next().charAt(0);

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				freq++;
			}
		}

		System.out.println(ch+" appears "+freq+" times in the entered string.");
	}
}