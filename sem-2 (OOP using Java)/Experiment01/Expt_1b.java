// WAP to find largest of 3 numbers using nested if else and nested ternary operator.

import java.lang.*;

class Largest
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);

		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is largest");
			}
		}
		if(b>a)
		{
			if(b>c)
			{
				System.out.println(b+" is largest");
			}
		}
		if(c>a)
		{
			if(c>b)
			{
				System.out.println(c+" is largest");
			}
		}
	}
}
