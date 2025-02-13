/*
	Write a multithreaded program a java program to print Table of Five, Seven and Thirteen using Multithreading 
	(Use Thread class for the implementation).
*/

import java.util.*;

class TableOfFive extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("5 x "+i+" = "+(i*5));
		}
	}
}

class TableOfSeven extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("7 x "+i+" = "+(i*7));
		}
	}
}

class TableOfThirteen extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("13 x "+i+" = "+(i*13));
		}
	}
}

class Expt13_a
{
	public static void main(String args[])
	{	
		TableOfFive five=new TableOfFive();
			five.start();
		TableOfSeven seven=new TableOfSeven();
			seven.start();
		TableOfThirteen thirteen=new TableOfThirteen();
			thirteen.start();
	}
}