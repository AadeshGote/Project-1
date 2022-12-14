package testcases;
import java.util.Scanner;

public class Testcase18 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a String");
	String str=sc.nextLine();
	String res="";
	
	for(int i=0; i<str.length(); i++)
	{
		char ch=str.charAt(i);
		int x=(int)ch;
		res=res+(char)(x+32);// IF u want to convert from lower to upper case use(x-32)
	}
	System.out.println(res);
	sc.close();
  }
}
