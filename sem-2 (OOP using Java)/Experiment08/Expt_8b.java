/*
	WAP to create a super class having a variable. 
	Let the variable be initialized to some value within a constructor. 
	This class should have a method display () to display the initial value of the variable. 
	Derive a sub class that accesses the constructor, variable and method of the super class using super keyword.
*/

import java.util.*;
import java.lang.*;

class SuperClass
{
	private int a;
	SuperClass()
	{
		a=4;
	}

	public void display()
	{
		System.out.println(a);
	}
}

class SubClass extends SuperClass
{
	void show()
	{
		super.display();
	}
}

class Expt8_b
{
	public static void main(String args[])
	{
		SubClass s=new SubClass();
		s.show();
	}
}
	