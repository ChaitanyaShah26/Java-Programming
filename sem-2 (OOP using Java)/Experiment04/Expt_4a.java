/* WAP to accept students name from command line and store them in vector. */

import java.util.*;

class StudentNameInVector
{
	public static void main(String args[])
	{
		Vector student=new Vector();

		for(int i=0;i<args.length;i++)
		{
			student.add(args[i]);
		}

		for(int i=0;i<student.capacity();i++)
		{
			System.out.println(student.elementAt(i));
		}
	}
}