package corejava;
import java.util.Scanner;

public class Armstrong02 
{
   static void strong(int no)
{
	
	int n1=no;
	int copy=no;
	int count=0;
	int sum=0;
	
	while(no!=0)
	{	
		count++;
		
		no=no/10;
		
	}
	while(copy!=0)
	{
		
		int rem=copy%10;
		int prod=1;
		for(int i=1; i<=count; i++)
		{
		  prod=prod*rem;
		}
		sum=sum+prod;
		copy=copy/10;
	}
	
	if(n1==sum)
	{
		System.out.println(n1+" is armstrong number");
	}
	else
	{
		System.out.println(n1+" is not armstrong number");
	}	
}
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("enter a number: ");
	int no=sc.nextInt();
	
	strong(no);
	sc.close();
  }
}
