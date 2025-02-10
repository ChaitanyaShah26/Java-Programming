//Experiment 8_c

import java.util.*;
import java.lang.*;

class Staff
{
	Scanner sc=new Scanner(System.in);
	String name;
	int code;
}

class Teacher extends Staff
{
	String subject;
	int experience;
	public void read()
	{
		System.out.println("Class-Teacher");
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Code of Teacher : ");
		code=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Subject : ");
		subject=sc.nextLine();
		System.out.println("Enter Experience in years : ");
		experience=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Code of Teacher : "+code);
		System.out.println("Subject : "+subject);
		System.out.println("Experience in years : "+experience);
	}
}

class Typist extends Staff
{
	int speed,exp;
}

class Regular extends Typist
{
	int salary;
	public void read()
	{
		System.out.println("Class-Regular Typist");
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Code of Typist : ");
		code=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Speed of Typist : ");
		speed=sc.nextInt();
		System.out.println("Enter Experience of Typist in years: ");
		exp=sc.nextInt();
		System.out.println("Enter Salary : ");
		salary=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Code of Typist : "+code);
		System.out.println("Speed : "+speed);
		System.out.println("Experience : "+exp);
		System.out.println("Salary : "+salary);
	}
}

class Casual extends Typist
{
	int daily_wages;
	public void read()
	{
		System.out.println("Class-Casual Typist");
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Code of Typist : ");
		code=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Speed of Typist : ");
		speed=sc.nextInt();
		System.out.println("Enter Experience of Typist in years: ");
		exp=sc.nextInt();
		System.out.println("Enter Daily Wages : ");
		daily_wages=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Code of Typist : "+code);
		System.out.println("Speed : "+speed);
		System.out.println("Experience : "+exp);
		System.out.println("Daily Wages : "+daily_wages);
	}
}

class Officer extends Staff
{
	String department;
	char grade;
	public void read()
	{
		System.out.println("Class-Officer");
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Code of Officer : ");
		code=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Department : ");
		department=sc.nextLine();
		System.out.println("Enter Grade of Officer : ");
		grade=sc.next().charAt(0);
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Code of Officer : "+code);
		System.out.println("Department : "+department);
		System.out.println("Grade of Officer : "+grade);
	}
}

class Expt8_c
{
	public static void main(String args[])
	{
		Teacher t=new Teacher();
		t.read();
		System.out.println();

		Officer o=new Officer();
		o.read();
		System.out.println();

		Regular r=new Regular();
		r.read();
		System.out.println();

		Casual c=new Casual();
		c.read();
		System.out.println();

		System.out.println("Teacher's Data:");
		t.display();
		System.out.println();
		System.out.println("Officer's Data:");
		o.display();
		System.out.println();
		System.out.println("Regular Typist's Data:");
		r.display();
		System.out.println();
		System.out.println("Casual Typist's Data:");
		c.display();
		System.out.println();
	}
}
