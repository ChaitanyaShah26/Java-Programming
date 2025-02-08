// WAP to find grade of student from input marks using if else ladder.

import java.util.Scanner;

class Grade
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks:");
		double marks=sc.nextDouble();
		
		if(marks>=90)
			System.out.println("Grade:O");
		else if(marks>=80 && marks<90)
			System.out.println("Grade:A+");
		if(marks>=70 && marks<80)
			System.out.println("Grade:A");
		if(marks>=60 && marks<70)
			System.out.println("Grade:B+");
		if(marks>=50 && marks<60)
			System.out.println("Grade:B");
		if(marks>=45 && marks<50)
			System.out.println("Grade:C");
		if(marks>=40 && marks<45)
			System.out.println("Grade:D");
		if(marks<40)
			System.out.println("Grade:F");
	}
}
