package corejava;

public class Fibonacci 
{
 public static void main(String[] args) 
 {
	int f1=0;
	int f2=1;
	int f3;
	
	System.out.print(f1+" "+f2); //for printing f1 and f2, as they dont come in 2nd sop below.
	for(int i=1; i<=10; i++)
	{
		f3=f1+f2;
		
		System.out.print(" "+f3);
		
		f1=f2;
		f2=f3;
	}
 }
}
