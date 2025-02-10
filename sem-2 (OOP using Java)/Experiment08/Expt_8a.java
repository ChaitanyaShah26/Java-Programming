/*
	WAP to demonstrate the role of Constructors in inheritance in the following class diagram.
		class A <-- class B <-- class C
*/


import java.util.*;

class A
{
	A()
	{
		System.out.println("Inside Class A");	
	}
}

class B extends A
{
	B()
	{
		System.out.println("Inside Class B");
	}
}

class C extends B
{
	C()
	{
		System.out.println("Inside Class C");
	}	
}

class Expt8_a
{
	public static void main(String args[])
	{
		C obj=new C();
	}
}
