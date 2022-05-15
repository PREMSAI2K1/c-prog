class count
{
static int count=0;
public static void main(String arg[])
{
 count c1=new count(); 
 count c2=new count();
 count c3=new count(); 
 count c4=new count();
 System.out.println("Number of Objects="+count);
}
count()
{count++;
System.out.println(count);
}
}