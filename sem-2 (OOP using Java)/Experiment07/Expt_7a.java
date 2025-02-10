// WAOOP to count the no. of objects created of a class using constructors.

import java.util.*;
import java.lang.*;

class Expt7_1
{
	static int count=0;
	Expt7_1()
	{
		count++;
	}
	public static void main(String args[])
	{
		Expt7_1 e1=new Expt7_1();
		Expt7_1 e2=new Expt7_1();
		Expt7_1 e3=new Expt7_1();
		Expt7_1 e4=new Expt7_1();

		System.out.println("no of objects created ="+count);

	}
}
