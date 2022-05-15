import java.io.*;
import java.util.*;
class Filecopy
	{
	public static void main(String args[])
	throws FileNotFoundException,IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter src file");
		String src=sc.nextLine();
		System.out.println("enter dest file");
		String dest=sc.nextLine();


		FileInputStream fis=new FileInputStream(src);
		FileOutputStream fos=new FileOutputStream(dest);
		int data;
		while((data=fis.read())!=-1)
		{
			fos.write(data);
		}
		System.out.println("copied");
	}
}

