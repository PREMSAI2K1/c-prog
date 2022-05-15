import java.util.*;
class office
{
void getvalue()
{
Scanner s=new Scanner(System.in);
System.out.println("enter emp no:");
int id=s.nextInt();
System.out.println("enter emp name:");
String t=s.next();
System.out.println("enter emp salary:");
int sa=s.nextInt();
System.out.println("emp id is:"+id+"\nemp name is:"+t+"\n emp salary is:"+sa);
}
}
class teach extends office
{
void setvalue()
{
Scanner f=new Scanner(System.in);
System.out.println("enter teaching designation:");
String d=f.next();
office i=new office();
i.getvalue();
System.out.println("teaching designation:"+d);
}
}
class non extends office
{
void setvalue()
{
Scanner h=new Scanner(System.in);
System.out.println("enter non-teaching designation:");
String d=h.next();
office g= new office();
g.getvalue();System.out.println("non-teaching designation:"+d);
}
}
class Educationalhierarcy
{
public static void main(String args[])
{
office o=new office();
teach k=new teach();
non w=new non();
k.setvalue();
w.setvalue();
}
}
