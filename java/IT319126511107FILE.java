import java.io.*;
import java.util.*;
class IT319126511107FILE
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter file name:");
String name = s.nextLine();
File f = new File(args[0]);
if(f.exists())
{
System.out.println("The file " +name+ " exists");
}
else
{
System.out.println("The file " +name+ " does not exist");
}

if(f.exists())
{
if(f.canRead())
{
System.out.println("The file " +name+ " is readable");
}
else
{
System.out.println("The file " +name+ " is not readable");
}
if(f.canWrite())
{
System.out.println("The file " +name+ " is writeable");
}
else
{
System.out.println("The file " +name+ " is not writeable");
}
System.out.println("The file type is: " +name.substring(name.indexOf('.')+1));
System.out.println("The Length of the file:" +f.length());
}
}
}