/*
	WAP to implement three classes namely Student, Test and Result. 
	Student class has member as rollno, and read(). 
	Test class has members as sem1_marks and sem2_marks and read(). 
	Result class has member as total. 
	Create an interface named sports that has a member score (). 
	Derive Test class from Student and Result class has multiple inheritances from Test and Sports.
	Total is formula based on sem1_marks, sem2_mark and score. Use super keyword.
*/

import java.util.*;

interface Sports
{
	int score();
}

class Student
{
	Scanner sc=new Scanner(System.in);
	int rollno;
	public void read()
	{
		System.out.println("Enter Roll No. of Student : ");
		rollno=sc.nextInt();
	} 
}

class Test extends Student
{
	int sem1_marks,sem2_marks;
	public void read()
	{
		super.read();
		System.out.println("Enter Sem 1 Marks : ");
		sem1_marks=sc.nextInt();
		System.out.println("Enter Sem 2 Marks : ");
		sem2_marks=sc.nextInt();
	}
}

class Result extends Test implements Sports
{
	int total;
	public int score()
	{
		return 160;
	}
	public void display()
	{
		total=sem1_marks+sem2_marks+score();
		System.out.println();
		System.out.println("Final Result\n");
		System.out.println("Roll No. - "+rollno);
		System.out.println("Semester 1 - "+sem1_marks);
		System.out.println("Semester 2 - "+sem2_marks);
		System.out.println("Sports Score - "+score());
		System.out.println();
		System.out.println("Total Marks = "+total);
	}
}

class Expt9_b
{
	public static void main(String args[])
	{
		Result res=new Result();
		res.read();
		res.display();
	}
}