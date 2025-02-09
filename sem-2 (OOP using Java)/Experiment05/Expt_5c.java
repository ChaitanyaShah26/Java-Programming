/* 	WAP to find value of y using recursive function (static), where y=x^n 	*/

import java.util.*;
import java.lang.*;

class Expt_5c
{

	static int power(int x,int n)
	{
		if(n==1)
		{
			return x;
		}
		else
		{
			return (x*power(x,n-1));
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number : ");
		int x=sc.nextInt();
		System.out.println("Enter power : ");
		int n=sc.nextInt();

		System.out.println(x+"^"+n+"="+power(x,n));
	}
}