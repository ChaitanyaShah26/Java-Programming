// c. WAP to create an object of a class, delete the same object by calling System. gc () and display a message that the “object has been deleted”.

import java.lang.*;

class Garbage
{
   int id;
   String name;

   Garbage(int id, String name)
   {
      this.id = id;
      this.name = name;
   }

   public String toString()
   {
      return "Garbage [id=" + id + ", name=" + name + "]";
   }
}

class Expt_10c
{
   public static void main(String[] args)
   {
      Garbage obj = new Garbage(1, "Object 1");
      System.out.println("Object created: " + obj);

      obj = null;
      System.gc();

      System.out.println("Object has been deleted.");
   }
}