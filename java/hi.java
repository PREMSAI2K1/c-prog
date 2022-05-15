class hi implements Runnable
{
public void run()
{
System.out.println("thread is running....");
}
public static void main(String args[])
{
hi t=new hi();
hi r=new hi();
Thread p=new Thread(t);
Thread k=new Thread(r);
p.start();
k.start();
System.out.println("hello");
}
}