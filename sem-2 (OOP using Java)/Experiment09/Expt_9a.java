/*
	Design an interface with a method reversal. 
	This method takes a string as input and returns the reversed string. 
	Create a class that implements the above interface.
*/

import java.util.*;

interface StringRev
{
	public String reversal(String s);
}

class StringReverse implements StringRev
{
	public String reversal(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		s=sb.toString();
		return s;
	}
}

class Expt9_a
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();

		StringReverse sr=new StringReverse();
		System.out.println("The reversed String is : "+sr.reversal(str));
	}
}