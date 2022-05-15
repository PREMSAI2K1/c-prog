public class t1 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Thread t=Thread.currentThread();
newthreaddd o1=new newthreaddd("_|-");//positive edge pulse
newthreaddd o2=new newthreaddd("-|_");//negative edge pulse
}
}
class newthreaddd extends Thread
{
Thread t1;
newthreaddd(String s)
{
t1=new Thread(this);
t1.setName(s);
t1.start();
}
public void run() {
try {
for(int i=0;i<10;i++)
{
System.out.print(t1.getName());
t1.sleep(1000);
}
}
catch(InterruptedException e) {
System.out.println("interrupted"+e);
}
}
}