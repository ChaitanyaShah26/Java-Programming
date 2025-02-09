// WAP to count the number of objects made of a particular class using static variable and static method and display the same.

import java.util.*;
import java.lang.*;

class NumberofObjects
{
     static int a=10,count=0;
	 NumberofObjects()
	 {
	 	a--;
	 	count++;
	 }
	public static void output()
	{
		System.out.println(“no of objects =”+count);
	}
	public static void main(String args[])
	{
		NumberofObjects a1=new NumberofObjects();
		NumberofObjects a2=new NumberofObjects();
		NumberofObjects a3=new NumberofObjects();
		NumberofObjects a4=new NumberofObjects();
		NumberofObjects a5=new NumberofObjects();
		NumberofObjects a6=new NumberofObjects();
		output();
	}
}
