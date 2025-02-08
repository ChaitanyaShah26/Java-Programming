/*
	The annual examination results of 5 students are tabulated as follows :
	|	Roll No	|	Subject1	|	Subject2	|	Subject3	|
			
			
WAP to read the data and determine the following-
	Total marks obtained by each student
	The student who obtained the highest total marks

*/

import java.util.Scanner;
import java.lang.*;

class ExamResult
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number of Students : ");
		int num=sc.nextInt();

		int result[][]=new int[num][5];

		System.out.println("Enter record of Student's Exam Results : \n");
		int i,j;
		for(i=0;i<num;i++)
		{
			int total=0;

			System.out.println("Enter record of Student "+(i+1)+" : ");
			for(j=0;j<4;j++)
			{
				
				if(j==0)
				{
					System.out.print("Enter Roll No. :");
					result[i][j]=sc.nextInt();	
				}else if(j==1)
				{
					System.out.print("Enter Subject1 Marks :");
					result[i][j]=sc.nextInt();	
				}else if(j==2)
				{
					System.out.print("Enter Subject2 Marks :");
					result[i][j]=sc.nextInt();	
				}
				else if(j==3)
				{
					System.out.print("Enter Subject3 Marks :");
					result[i][j]=sc.nextInt();	
				}

				if(j!=0)
				{
					total=total+result[i][j];
				}
			}
			result[i][j]=total;
			System.out.println();
		}

		System.out.println("Exam Result Student Record : ");
		System.out.println("Roll No.\tSubject1\tSubject2\tSubject3\tTotal Marks");
		for(i=0;i<num;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(result[i][j]+"\t\t");
			}
			System.out.println();
		}

		int r=0,maxMarks=0;
		for(i=0;i<num;i++)
		{
			for(j=0;j<5;j++)
			{
				if(j==4)
				{
					if(result[i][j]>maxMarks)
					{
							maxMarks=result[i][j];
							r=i;
					}
				}
			}
		}

		System.out.println("Record of Student with Highest Marks : ");
		System.out.println("Roll No.\tSubject1\tSubject2\tSubject3\tTotal Marks");
		for(j=0;j<5;j++)
		{
			System.out.print(result[r][j]+"\t\t");
		}

	}
}