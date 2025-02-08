/*
WAP to display following pattern using irregular arrays (jagged arrays):
1
1    2
1    2     3 ………..
*/


import java.lang.*;
import java.util.*;

class Pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number of rows in pattern : ");
		int n=sc.nextInt();

		int p[][]=new int[n][];

		for(int i=0;i<n;i++)
		{
			p[i]=new int[i+1];
		}

		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				p[i][j]=j+1;
			}
		}

		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}
	}
}