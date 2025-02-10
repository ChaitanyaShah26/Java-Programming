/*
WAP to perform mathematical operations on 2 complex numbers by passing and returning object as argument. Show the use of this pointer
*/

import java.util.*;

class Complex
{
	Scanner sc = new Scanner(System.in);
	int real,img;
	void setdata()
	{
		System.out.println("Enter the real part:");
		real=sc.nextInt();
		System.out.println("Enter the imaginary part:");
		img=sc.nextInt();
	}
	static void add(Complex c1 , Complex c2)
	{
		int i,r;
		r=c1.real+c2.real;
		i=c1.img+c2.img;
		System.out.println("Addition is ");
		System.out.print(r+" + "+i);
		System.out.println("i");
	}
}
class Expt6_2
{
	public static void main(String args[])
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();
		c1.setdata();
		c2.setdata();
		Complex.add(c1,c2);
	}
}
