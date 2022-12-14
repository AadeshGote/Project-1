package testcases;
import java.util.Scanner;

public class Testcase09 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the digits");
	
	String str=sc.nextLine(); 
	char[]ch=str.toCharArray();
	
	int count=0;
	for(int i=0; i<ch.length; i++)
	{
		count++;
		System.out.println(count);
	}
		if(count==10)
		{
			System.out.println("THANK YOU");
		}
		else
		{
			System.out.println("SORRY");
		}
	
	sc.close();
  }
}
