/*
Demonstrate using a suitable example that a base class reference variable can point to a child class object or a base class object using the concept of dynamic method dispatch (dynamic polymorphism).
*/

import java.util.*;
import java.lang.*;

class A
{
	A()
	{
		System.out.println("Class A Constructor");
	}
	public void display()
	{
		System.out.println("Class A Display method");
	}
}

class B extends A
{
	B()
	{
		super();
		System.out.println("Class B Constructor");
	}
	public void display()
	{
		super.display();
		System.out.println("Class B Display method");
	}
}

class C extends B
{
	C()
	{
		super();
		System.out.println("Class C Constructor");
	}
	public void display()
	{
		super.display();
		System.out.println("Class C Display method");
	}
}

class Expt_10a
{
	public static void main(String args[])
	{
		A ob;
		ob=new B();
		ob.display();

		ob=new C();
		ob.display();
	}
}