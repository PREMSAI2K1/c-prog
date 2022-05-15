import java.util.*;
class IT319126511107_16
{
public static void main(String args[]) throws MinimumBal 
{
Scanner sc= new Scanner(System.in);
int bal;
System.out.println("Enter current balance:");
bal=sc.nextInt();
System.out.println("Enter amount to withdrawal");
int n = sc.nextInt();
try {
if (bal<n)
throw new MinimumBal("Low Balance\nYour Current balance is "+bal);
else System.out.println("Money left:"+(bal-n));        }
catch (MinimumBal e)  
{
System.out.println(e);
}
}
}
class MinimumBal extends Exception
{
String message;
public MinimumBal(String message)  
{
this.message = message;  
}
public String toString()
{
return message;
}
}