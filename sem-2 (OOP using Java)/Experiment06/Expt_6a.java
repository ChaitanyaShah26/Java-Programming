/*
WOOP to arrange the names of students in descending order of their total marks, input data consists of student’s details such as names, ID. no, marks of maths, physics, chemistry. 
(Use array of objects)
*/

import java.util.*;

class Students
{
	int phy,chem,maths,id,total;
	String a ;
	Scanner sc = new Scanner(System.in);
	void getdetails()
	{
		System.out.println("Enter student's name:");
		a= sc.nextLine();
		System.out.println("Enter student's id:");
		id= sc.nextInt();
		System.out.println("Enter student's physic's marks:");
		phy = sc.nextInt();
		System.out.println("Enter student's chemistry's marks:");
		chem = sc.nextInt();
		System.out.println("Enter student's maths marks:");
		maths= sc.nextInt();
		total = phy+chem+maths;
	}
	void showdetails()
	{
		System.out.println("The name of the student is :"+" "+a);
		System.out.println("The id of the student is :"+" "+id);
		System.out.println("The phy marks of the student are :"+" "+phy);
		System.out.println("The chem marks of the student are :"+" "+chem);
		System.out.println("The maths marks of the student are :"+" "+maths);
	}
}

class Expt6_1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Students temp = new Students();
		int i,n;
		System.out.println("Enter the number of students whose data is to be entered:");
		n = sc.nextInt();
		Students s[] = new Students[n];
		for(i=0;i<n;i++)
		{
			s[i]= new Students();
			s[i].getdetails();
		}

		for(i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(s[j].total<s[j+1].total)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}

		System.out.println("The result is:");
		for(i=0;i<n;i++)
		{
			s[i].showdetails();
		}
	}
}
