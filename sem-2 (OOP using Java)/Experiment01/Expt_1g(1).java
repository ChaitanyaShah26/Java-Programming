/*
WAP to display the following patterns:
1
2 1
1 2 3
4 3 2 1
1 2 3 4 5
6 5 4 3 2 1
1 2 3 4 5 6 7
*/

import java.util.Scanner;
class Patterns
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows:");
		int n=sc.nextInt();
		
		for(inti=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			else
			{
				for(int k=i;k>=1;k--)
				{
					System.out.print(k+" ");
				}
				System.out.println();
			}		
		}
		
	}
}
