/* WAP to find out number of uppercase & lowercase characters, blank spaces and digits from the string. */

import java.util.*;
import java.lang.*;

class StringFinding
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string : ");
		String str=sc.nextLine();

		char arr[]=str.toCharArray();

		int upper=0,lower=0,space=0,digit=0,spchar=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='0' && arr[i]<='9')
			{
				digit++;
			}
			else if(arr[i]>='A' && arr[i]<='Z')
			{
				upper++;
			}
			else if(arr[i]>='a' && arr[i]<='z')
			{
				lower++;
			}
			else if(arr[i]==' ')
			{
				space++;
			}
			else
			{
				spchar++;
			}
		}
		System.out.println("Number of digits in string are : "+digit);
		System.out.println("Number of uppercase characters in string are : "+upper);
		System.out.println("Number of lowercase characters in string are : "+lower);
		System.out.println("Number of spaces in string are : "+space);
		System.out.println("Number of special characters in string are : "+spchar);
	}
}