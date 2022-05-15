import java.util.*;
class employee
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter employee no:");
int id=s.nextInt();
System.out.println("enter employee name");
String n=s.next();
System.out.println("enter employee basic salary");
int bas=s.nextInt(); System.out.println("your entered values are:"+id+" "+n+" "+bas);
int da=(bas*50)/100;
int hra=(bas*25)/100;
int pf=(bas*10)/100;
int pt=100;
int gross=bas+hra+da+pf+pt;
int net=gross-pf-pt;
System.out.println("gross salary is:"+gross+"\n net salary is:"+net);
}
}