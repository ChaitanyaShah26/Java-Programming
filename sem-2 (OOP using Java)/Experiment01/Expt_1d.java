// Write a menu driven program using switch case to perform mathematical operations.

import java.lang.*;
import java.util.Scanner;

class MathOperations
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int a;
		int b;
		char ch;
		System.out.println("Enter number1 : ");
		a=sc.nextInt();
		System.out.println("Enter number2 : ");
		b=sc.nextInt();
		System.out.println("Enter mathematical operation(+,-,*,/) : ");
		ch=sc.next().charAt(0);
		switch(ch)
		{
			case '+':
				System.out.println("Addition is="+(a+b));
				break;

			case '-':
				System.out.println("Subtraction is="+(a-b));
				break;

			case '*':
				System.out.println("Multiplication is="+(a*b));
				break;

			case '/':
				System.out.println("Division is="+(a/b));
				break;

			default :
				System.out.println("Enter valid Operation");
		}
	}
}
