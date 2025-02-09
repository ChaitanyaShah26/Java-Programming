// WAP to display area of square and rectangle using the concept of overloaded functions.

import java.util.*;
import java.lang.*;

class Expt5_2
{
	int side,len,bre;
	public void area(int l,int b)
	{
		len=l;
		bre=b;
		System.out.println("Area of rectangle is :"+(len*bre));
	}
	public void area(int s)
	{
		side=s;
		System.out.println("Area of square is :"+(side*side));

	}
	public static void main(String args[])
	{
		Expt5_2 e=new Expt5_2();
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter length,breadth and side");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int s=sc.nextInt();

		e.area(l,b);
		e.area(s);
	}
}
