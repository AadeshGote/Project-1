package testcases;
import java.util.Scanner;

class Absolute
{
  int abs(int a)
  {
	  int n=21;
	  if(a<n)
	  {
		  int b=n-a;
		  return b;
	  }
	  else if(a>n)
	  {
		int c=(a-n)*2;
		  return c; 
	  }
	  return 0;
  }
}
public class Testcase12 
{
public static void main(String[] args) 
 {
	
	Scanner sc=new Scanner (System.in);
	for(int i=1; i<=3; i++)
	{
	System.out.println("Enter a value");
	int a=sc.nextInt();
	Absolute a1=new Absolute();
	
	System.out.println(a1.abs(a));
	}
	sc.close();
	
	
 }
}
