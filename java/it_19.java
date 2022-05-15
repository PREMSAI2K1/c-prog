public class it_19 {
public static void main(String[] args) {
// TODO Auto-generated method stub
newthreadd o1=new newthreadd("child thread1");
newthreadd o2=new newthreadd("child thread2");
newthreadd o3=new newthreadd("child thread3");
}
}
class newthreadd extends Thread
{
Thread t;
static callme temp=new callme();
newthreadd(String s)
{
t=new Thread(this);
t.setName(s);
t.start();
}
public void run()
{
synchronized(temp)
{
temp.call();
}
}
}
class callme
{
void call()
{
Thread temp=Thread.currentThread();
System.out.print("[");
try
{
temp.sleep(1000);
}
catch(InterruptedException e)
{
System.out.print("Interrupted");
}
System.out.println("]");
//System.out.println(Thread.currentThread()+" terminated");
}
}
