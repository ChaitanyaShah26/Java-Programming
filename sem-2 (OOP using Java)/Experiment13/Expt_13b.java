// Write a multithreaded program to display /*/*/*/*/*/*/*/* using 2 child threads.

class Pattern implements Runnable
{
	public void run()
	{
		if(Thread.currentThread().getName().equals("star"))
		{
			for(int i=0;i<10;i++)
			{
				try
				{
					System.out.print("*");
					Thread.sleep(500);
				}
				catch(InterruptedException ie)
				{
					System.out.println(ie);
				}
			}
		}

		if(Thread.currentThread().getName().equals("slash"))
		{
			for(int i=0;i<10;i++)
			{
				try
				{
					System.out.print("/");
					Thread.sleep(500);
				}
				catch(InterruptedException ie)
				{
					System.out.println(ie);
				}
			}
		}
		
	}
}

class Expt13_b
{
	public static void main(String args[])
	{
		Pattern p=new Pattern();
		Thread t1=new Thread(p,"slash");
		Thread t2=new Thread(p,"star");
		t1.start();
		t2.start();
	}
}