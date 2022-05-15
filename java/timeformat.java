import java.util.*;
public class timeformat
{
public static void main(String args[])
{
int hr,min,sec;
Scanner sc=new Scanner(System.in);
System.out.println("enter time in 12 hour formate:");
System.out.println("enter hour");
hr=sc.nextInt();
System.out.println("enter minutes:");
min=sc.nextInt();
System.out.println("enter seconds");
sec=sc.nextInt();
time t=new time(hr,min,sec);
}
}
class time
{
int h,m,s;
time(int x,int y,int z)
{
h=x;
m=y;
s=z;System.out.println(h+":"+m+":"+s);
}
}