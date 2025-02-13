/*
	WAP to create a package called vol having Cylinder class and volume (). 
	WAP that imports this package to calculate volume of a Cylinder.
*/

import java.util.*;
import vol.Cylinder;

class Expt_11b
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double radius,height;

		System.out.println("Enter radius of Cylinder: ");
		radius=sc.nextDouble();
		System.out.println("Enter height of Cylinder: ");
		height=sc.nextDouble();

		Cylinder c=new Cylinder();
		c.volume(radius,height);
	}
}