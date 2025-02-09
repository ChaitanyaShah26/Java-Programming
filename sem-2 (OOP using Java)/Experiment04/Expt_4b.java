/* WAP to add n strings in a vector array. Input new string and check if it is present in the vector. If present delete it else add to the vector */

import java.util.*;

class AddDeleteStringInVector
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		Vector<String> v=new Vector<String>();

		System.out.println("Enter number of strings to add in Vector Array : ");
		int n=sc.nextInt();

		System.out.println("Enter strings to add in Vector Array : ");
		for(int i=0;i<n;i++)
		{
			v.insertElementAt(sc.next(),i);
		}
		System.out.println("Vector Array is :\n"+v);

		System.out.println("Enter a string to search : ");
		String s=sc.next();
		if(v.contains(s))
		{
			v.removeElement(s);
		}
		else
		{
			v.addElement(s);
		}

		System.out.println("Vector Array after Add or Delete :\n"+v);
	}
}