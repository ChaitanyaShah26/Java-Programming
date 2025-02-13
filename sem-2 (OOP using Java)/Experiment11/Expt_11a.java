/*
	Write an abstract class program to calculate area of circle, rectangle and triangle.
*/

import java.util.*;
import java.lang.*;

abstract class Area
{
	public double area;
	public final double PI=3.14;
	public abstract void calculateArea();
	public void display()
	{
		System.out.println("Area = "+area);
	}
}

class Circle extends Area
{
	float rad;
	Circle(float r)
	{
		rad=r;
	}
	public void calculateArea()
	{
		area=PI*Math.pow(rad,2);
		System.out.println("\nFor Circle,");
		super.display();
	}
}

class Rectangle extends Area
{
	float length,breadth;
	Rectangle(float l,float br)
	{
		length=l;
		breadth=br;
	}
	public void calculateArea()
	{
		area=length*breadth;
		System.out.println("\nFor Rectangle,");
		super.display();
	}
}

class Triangle extends Area
{
	float base,height;
	Triangle(float b,float h)
	{
		base=b;
		height=h;
	}
	public void calculateArea()
	{
		area=0.5*base*height;
		System.out.println("\nFor Triangle,");
		super.display();
	}
}

class Expt_11a
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Area a;
		float r,l,br,b,h;

		System.out.println("Enter Radius of Circle : ");
		r=sc.nextFloat();

		System.out.println("Enter Length of Rectangle : ");
		l=sc.nextFloat();
		System.out.println("Enter Breadth of Rectangle : ");
		br=sc.nextFloat();

		System.out.println("Enter Base Length of Triangle : ");
		b=sc.nextFloat();
		System.out.println("Enter Height of Triangle : ");
		h=sc.nextFloat();

		a=new Circle(r);
		a.calculateArea();

		a=new Rectangle(l,br);
		a.calculateArea();

		a=new Triangle(b,h);
		a.calculateArea();
	}
}