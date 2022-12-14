package testcases;
import java.util.Scanner;

class Sums
{
	int add(int a,int b)
	{
		if(a==b)
		{
			int c=(a+b)*2;
			return c;
		}
		else
		{
			int d=a+b;
			return d;
		}
	}
}
public class Testcase16 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner (System.in);
	for(int i=1; i<=3; i++)
	{
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Sums s1=new Sums();
	System.out.println(s1.add(a, b));
	}	
	
	sc.close();
  }
}
