import java.util.Scanner;
class it107_16
{
 public static void main(String[]args)
 {
 bank o=new bank();
 Scanner s=new Scanner(System.in);
 int ch;
 if(o.login())
 {
 while(true)
 {
 System.out.println("enter a OPTION(NUMBER ONLY):\n1 to deposit\n2 to withdraw\n3 to balance enquiry\n4 to log-out");
 ch=s.nextInt();
 switch(ch)
 {
 case 1:o.deposit();
 break;
 case 2:o.withdraw();
 break;
 case 3:o.balance_enquiry();
 break;
 case 4:System.out.println("\t\t\tend of the session\n\t\t\tTHANK YOU!");
 System.exit(0);
 }
 }
 }
 }
}
class bank
{
 String username;
 String password;
 static int balance;
 boolean login()
 {
 System.out.print("username:");
 Scanner s=new Scanner(System.in).useDelimiter("\n");
 username=s.nextLine();
 System.out.print("password:");
 password=s.nextLine();
 try
 {
 if(!(password.equals("ABHI@11")))
 throw new user_denied_exception();
 else
 return true;
 }
 catch(user_denied_exception e)
 {
 e.invalid_login(username);
 return false;
 }
 }
 void deposit()
 {
 int amount;
 System.out.println("enter amount to deposit");
 Scanner s=new Scanner(System.in);
 amount=s.nextInt();
 try
 {
 if(amount<0)
 throw new user_denied_exception();
 else
 {
 balance+=amount;
 System.out.println("\t\t\tamount deposited");
 }
 
 }
 catch(user_denied_exception e)
 {
 e.invalid_amount(amount);
 }
 }
 void withdraw()
 {
 int amount;
 System.out.println("enter amount to withdraw");
 Scanner s=new Scanner(System.in);
 amount=s.nextInt();
 try
 {
 if(amount>balance)
 throw new user_denied_exception();
 else
 {
 balance-=amount;
 System.out.println("\t\t\tamount withdrawn");
 }
 }
 catch(user_denied_exception e)
 {
 e.invalid_amount1(amount);
 }
 }
 void balance_enquiry()
 {
 System.out.println("\t\t\tbalance:-"+balance);
 }
}
class user_denied_exception extends Exception
{
 public void invalid_login(String s)
 {
 System.out.println(s+"Invalid Login Details\n\t\t\tTRY AGAIN");
 }
 public void invalid_amount(int s)
 {
 System.out.println(s+"amount cannot be negative\n\t\t\tTRY AGAIN");
 }
 public void invalid_amount1(int s)
 {
 System.out.println(s+"-insufficient balance\n\t\t\tTRY AGAIN");
 }
}
