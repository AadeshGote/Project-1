package testcases;
import java.util.Scanner;
public class Testcase20 
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter a String");
	String str=sc.nextLine();
	String res=" ";
	for(int i=0; i<str.length(); i++)
	{
		char ch=str.charAt(i);
		
		if(ch!=' '&&ch>='A'&&ch<='Z')
		{
			int x=(int)ch;
			res=res+(char)(x+32);
		}
		else
			res=res+ch;
	}
		System.out.println(res);
	
	sc.close();
	
 }
}
