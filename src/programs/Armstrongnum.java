package programs;

import java.util.Scanner;

public class Armstrongnum 
{
   void num (int no) {
	
	   int n1=no;
	   int copy=no;
	   int sum=0;
	   int count=0;
	   
	   while(no!=0)
		{	
			count++;
		
			no=no/10;
			
		}
	   
	   while(copy!=0)
	   {
		   int rem=copy%10;
		    sum=(int) (sum+Math.pow(rem, count));
//		   int prod=1;
//		   for(int i=1; i<=count; i++)
//		     {
//			   prod=prod*rem;   
//		     }
//		   sum+=prod;
		   copy=copy/10;
	   }
	   System.out.println(sum);
	   if(n1==sum)
	   {
		   System.out.println("it is armstrong number");
	   }
	   else
	   {
		   System.out.println("it is not armstrong");
	   }
   }
   
   public static void main(String[] args) 
   {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter a value");
	int no= sc.nextInt();
	
	Armstrongnum a1=new Armstrongnum();
	a1.num(no);

	sc.close();
   }
}
