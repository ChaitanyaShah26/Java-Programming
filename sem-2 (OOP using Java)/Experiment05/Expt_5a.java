/*
	Create a class employee with data member’s empid, empname, designation and salary. 
	Write methods getemployee() to take user input, showgrade() to display grade of employee based on salary, showemployee() to display details of employee.
*/

import java.util.*;
import java.lang.*;

class Employee
{
	Long empid,salary;
	String empname,designation;
	Employee()
	{

	}
	public void getemployee(Long id,Long sal,String name,String desig)
	{
		empid=id;
		salary=sal;
		empname=name;
		designation=desig;
	}
	public void showemployee()
	{
		System.out.println("Name : "+empname);
		System.out.println("Employee Id : "+empid);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
	}
	public void showgrade(Long salary)
	{
		if(salary>=500000)
			System.out.println("Experienced");
		else if(salary>=300000 && salary<=500000)
			System.out.println("Fresher");
		else if(salary<=300000)
			System.out.println("Inexperienced");
	}

	public static void main(String args[])
	{
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of employee : ");
		String name=sc.next();
		System.out.println("Enter designation of employee : ");
		String desig=sc.next();
		System.out.println("Enter employee id of employee : ");
		Long id=sc.nextLong();
		System.out.println("Enter salary of employee : ");
		Long sal=sc.nextLong();

		e.getemployee(id,sal,name,desig);
		e.showemployee();
		e.showgrade(sal);
	}
}
