package corejava;
import java.util.Scanner;

public class Prime_number 
{
  private static Scanner sc;

public static void main(String[] args) 
  {
	  sc = new Scanner(System.in);
	  
	  System.out.println("Enter a number");
	  int no= sc.nextInt();
	
		boolean flag=true;
				
		for(int j=2; j<no; j++)
		{
			if(no%j==0)
			{
			flag=false;
			break;
			}
		}
		if(flag==true)
		{
			System.out.println(no+" is a prime number");
		}
		else
		{
			System.out.println(no+" is not a prime number");
		}
	}
  }

