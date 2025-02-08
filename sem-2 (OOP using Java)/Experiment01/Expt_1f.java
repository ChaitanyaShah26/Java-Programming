// WAP to print the sum of following series 1+1/2^2+1/3^2+1/4^2……+1/n^2

import java.util.Scanner;

class SumOfSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int n;
		System.out.println("Enter no. of terms in series");
		n=sc.nextInt();
		inti;
		double sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum+(1/Math.pow(i,2));
		}
		System.out.println("Sum of Series is = "+sum);
	}
}
