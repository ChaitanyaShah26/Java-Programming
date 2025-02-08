// Write a Java program that reads a positive integer from command line and count the number of digits the number (less than ten billion) has.

import java.lang.*;

class Digits
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int count=0;
			while(a!=0)
			{
				a=a/10;
				count++;
			}
			System.out.println("No. of digits is "+count);
	}
}
