/*
	WAP to implement inbuilt exceptions
	i.	Checked exceptions (compile time exceptions)
		a)	ClassNotFoundException
		b)	IOException
	ii.	Unchecked exceptions (run time exceptions)
		a)	NumberFormatException
		b)	ArithmeticException
		c)	ArrayIndexOutOfBounds
		d)	NullPointerException
*/

import java.io.*;
import java.util.*;
import java.lang.*;

class Expt12_a
{
	public static void main(String args[])
	{
		//ClassNotFoundException
		try
		{
			Class.forName("nonExistentClass");
		}
		catch(ClassNotFoundException e1)
		{
			System.out.println("ClassNotFoundException: "+e1.getMessage());
		}

		//IOException
		FileInputStream f=null;
		try
		{
			f=new FileInputStream("nonexistent_file.txt");
			int i;
			while((i=f.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(FileNotFoundException e2)
		{
			System.out.println("IOException: File Not Found: "+e2.getMessage());
		}
		catch (IOException e3) 
		{
            System.out.println("IOException: Reading error: " + e3.getMessage());
        }
        finally 
        {
            if (f != null) 
            {
                try 
                {
                    f.close();
                } 
                catch(IOException e4) 
                {
                    System.out.println("IOException: Error closing file: " + e4.getMessage());
                }
            }
        }

        //NumberFormatException
        String invalidNumber="not-a-number";
        try
        {
        	Integer.parseInt(invalidNumber);
        }
        catch(NumberFormatException e5)
        {
        	System.out.println("NumberFormatException: " + e5.getMessage());
        }

        //ArithmeticException
        try 
        {
            int x = 10;
            int y = 0;
            int z = x / y;
        } 
        catch (ArithmeticException e6) 
        {
            System.out.println("ArithmeticException: " + e6.getMessage());
        }

        //ArrayIndexOutOfBounds
        int[] arr = new int[5];
        try 
        {
            arr[5] = 10;
        } 
        catch (ArrayIndexOutOfBoundsException e7)
        {
            System.out.println("ArrayIndexOutOfBoundsException: " + e7.getMessage());
        }

        //NullPointerException
        String str = null;
        try 
        {
            str.length();
        } 
        catch (NullPointerException e8) 
        {
            System.out.println("NullPointerException: " + e8.getMessage());
        }
	}
}