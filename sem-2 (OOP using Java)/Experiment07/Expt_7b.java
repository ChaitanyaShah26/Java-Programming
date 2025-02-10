/*
WAP to display area of square and rectangle using the concept of overloaded constructor (use parameterized, non-parameterized and copy constructor).
*/

import java.util.*;
import java.lang.*;

class Expt7_2
{
	static int l,b,s,a1,a2;
	Expt7_2()
	{
		l=0;
		b=0;
		s=0;
	}
	Expt7_2(int len,int bre)
	{
		l=len;
		b=bre;
		System.out.println("The area is : "+(l*b));
	}
	Expt7_2(Expt7_2 e1)
	{
		l=e1.l;
		b=e1.l;
		System.out.println("The area is : "+(l*b));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter length, breadth :");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Expt7_2 e=new Expt7_2();
		Expt7_2 e1=new Expt7_2(length,breadth);
		Expt7_2 e2=new Expt7_2(e1);
	}
}
