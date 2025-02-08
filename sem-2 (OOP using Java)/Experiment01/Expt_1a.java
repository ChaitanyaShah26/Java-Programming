/*
	Given an integer, n, perform the following conditional actions:
	-If n is odd, print Weird
	-If n is even and in the inclusive range of 2 to 5, print Not Weird
	-If n is even and in the inclusive range of 6 to 20, print Weird
	-If n is even and greater than 20, print Not Weird
*/

import java.lang.*;

class testnumber
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);

		if(a%2!=0)
			System.out.println(a+" is wierd");
		else if((a%2==0) && (a>2&&a<=5))
			System.out.println(a+" is not wierd");
		else if((a%2==0) && (a>=6&&a<=20))
			System.out.println(a+" is wierd");
		else if(a%2==0&&a>20)
			System.out.println(a+" Not wierd");
	}
}
