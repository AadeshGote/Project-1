package testcases;
import java.util.Scanner;

class Two_ints
{
	boolean sum(int a,int b) // two ints a and b
	{
		if(a==10||b==10||a+b==10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Testcase15 
{
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 for (int i=0; i<3; i++) 
	 {
		System.out.println("Enter values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Two_ints t1=new Two_ints();
		boolean x=t1.sum(a,b);
		System.out.println(x);
		System.out.println("****************");
	 }
	 sc.close();
 }
}
