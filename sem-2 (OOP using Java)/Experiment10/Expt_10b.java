/*
	Adwita , 8th Grade student wants to write a functions to calculate simple interest, compound interest. 
	She wants to keep same (final) rate of interest for every input of principal and time.
	She wants to ensure that the declared functions are not overridden in any subclasses and the class is not inherited by any other class.
	Help her to declare the variables methods and classes and write the code for the same using final keyword.
*/

import java.util.*;
import java.lang.*;

final class SimpleInterest
{
	private double principal,time;
	private double simpleInterest;
	SimpleInterest(double p,double t)
	{
		principal=p;
		time=t;
	}
	public final void calculateSI(float RATE)
	{
		simpleInterest=(principal*time*RATE)/100;
		System.out.println("\nSimple Interest = "+simpleInterest);
	}
} 


final class CompoundInterest
{	
	private double principal,time;
	private double compoundInterest;
	CompoundInterest(double p,double t)
	{
		principal=p;
		time=t;
	}
	public final void calculateCI(float RATE)
	{
		compoundInterest=principal*Math.pow((1+RATE/100),time)-principal;
		System.out.println("\nCompound Interest = "+compoundInterest);
	}
}

class Expt_10b
{
	public static void main(String args[])
	{
		final float RATE=2.5f;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the principal amount : ");
		double p=sc.nextDouble();
		System.out.println("Enter the time period (in years) : ");
		double t=sc.nextDouble();

		SimpleInterest si=new SimpleInterest(p,t);
		si.calculateSI(RATE);
		CompoundInterest ci=new CompoundInterest(p,t);
		ci.calculateCI(RATE);
	}
}