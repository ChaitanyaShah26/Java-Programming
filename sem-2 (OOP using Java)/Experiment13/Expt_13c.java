//Write a program to demonstrate thread methods: wait notify suspend resume join setpriority getpriority setname getname

public class Expt13_c 
{
    public static void main(String[] args) 
    {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();

        try 
        {
            thread1.join();
            thread2.join();
        } 
        catch(InterruptedException e) 
        {
            e.printStackTrace();
        }
    }

    static class MyRunnable implements Runnable 
    {
        @Override
        public void run() 
        {
            String threadName = Thread.currentThread().getName();
            System.out.println("Thread Name: " + threadName);

            int priority = Thread.currentThread().getPriority();
            System.out.println("Thread Priority: " + priority);

            if (threadName.equals("Thread 1")) 
            {
                Thread.currentThread().suspend();
                System.out.println(threadName + " is suspended");
                Thread.currentThread().resume();
                System.out.println(threadName + " is resumed");
            }

            if (threadName.equals("Thread 2")) 
            {
                synchronized (this) 
                {
                    System.out.println(threadName + " is waiting...");
                    try 
                    {
                        wait(2000);
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                    System.out.println(threadName + " is notified");
                    notify();
                }
            }
        }
    }
}