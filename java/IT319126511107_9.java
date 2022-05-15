import java.util.*;
public class IT319126511107_9
{
public static void main(String args[])
{
int n;
String str;
for (int i = 0; i < args.length; i++)
System.out.println (args[i]);
for(int i=0;i<args.length;i++)
{
for(int j=i+1;j<args.length;j++)
{
if(args[i].compareTo(args[j])>0)
{
str=args[i];
args[i]=args[j];
args[j]=str;
}
}
}
System.out.println("The names in alphabetical order are:");
for(int i=0;i<args.length;i++)
{
System.out.println(args[i]);
}
}
}