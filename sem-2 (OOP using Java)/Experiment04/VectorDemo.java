import java.util.*;

class VectorDemo
{
    public static void main(String args[])
    {
        Vector v=new Vector();
    //to read Names from Command Line arguments and store in to vector
        v.add(args[0]);
        v.add(args[1]);
        v.add(args[2]);
        v.add(args[3]);
        v.add(args[4]);
        Enumeration e=v.elements();
        System.out.println("Elements in Vector:  ");
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

    }
}