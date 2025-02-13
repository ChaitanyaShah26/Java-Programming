/*
	Write a Java Program to Create a User Defined Exception class MarksOutOfBoundsException, 
	If Entered marks of any subject is greater than 100 or less than 0, 
	and then program should create a user defined Exception of type MarksOutOfBoundsException and must have a provision to handle it.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class MarksOutOfBoundsException extends Exception 
{
	public MarksOutOfBoundsException(int totalMarks)
	{
		System.out.println("MarksOutOfBoundsException: Marks>"+totalMarks);
	}
}

class Result
{
	public void displayMarks(int marks,int totalMarks) throws MarksOutOfBoundsException
	{
		if(marks>60)
		{
			throw new MarksOutOfBoundsException(totalMarks);
		}
		else
		{
			System.out.println("Marks: "+marks);
		}
	}
}

class Expt12_b
{
	public static void main(String args[])
	{
		int marks,totalMarks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total Marks: ");
		totalMarks=sc.nextInt();
		System.out.println("Enter your marks: ");
		marks=sc.nextInt();

		Result r=new Result();

		try
		{
			r.displayMarks(marks,totalMarks);
		}
		catch(MarksOutOfBoundsException mobe)
		{
			System.out.println(mobe);
		}	
		finally
		{
			System.out.println("Enter marks again....");
		}
	}
}