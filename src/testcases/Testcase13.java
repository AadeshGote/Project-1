package testcases;
import java.util.Scanner;

public class Testcase13 //
 {
  public static void main(String[]args)
  {
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter avalue");
	 int f=sc.nextInt();
	 System.out.print(f+"th box has ");
	 
	 
	 int f1=0, f2=1;
	 int f3=0;
	 for(int i=0; i<f-2; i++)/* i<f-2, bcuz we reduce the values 
		                       of f1 and f2 from f, or we will
		                       get 2 fib values ahead.
		                       instead of 5th fib we get 
		                       7th fib value*/
	 {
		 f3=f1+f2;
		 f1=f2;
		 f2=f3; 
	 }
	 System.out.println(f3+" fruits");
	 
	sc.close();
	
  }
 }
