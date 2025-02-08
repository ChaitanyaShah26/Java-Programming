
/*
You have been given an array of positive integers A1, A2,……., An with length N and you have to print an array of same length(N) where the values in the new array are the sum of every number in the array, except the number at that index.
i/p  1 2 3 4
For the 0th index, the result will be 2+3+4=9, similarly for the first, second and third index the corresponding results will be 8, 7 and 6 respectively.
i/p  4 5 6
o/p  11 10 9

*/

import java.lang.*;
import java.util.*;

class SumofElementsinArray
{
	public static void main(String args[])
	{
		int size,arr1[],arr2[];

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements(size) of Array : ");
		size=sc.nextInt();

		arr1=new int[size];
		arr2=new int[size];

		System.out.println("Enter "+size+" Elements in Array : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("Enter element "+(i+1)+": ");
			arr1[i]=sc.nextInt();
		}

		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum=0;
			for(int j=0;j<arr1.length;j++)
			{
				if(i!=j)
				{
					sum=sum+arr1[j];
				}
			}
			arr2[i]=sum;
		}

		System.out.println("Elements of Original Array : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+"\t");
		}

		System.out.println();
		System.out.println("Elements of Array with Sum of elements from original array excluding index array element : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr2[i]+"\t");
		}
	}
}