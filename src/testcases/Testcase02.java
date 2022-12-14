package testcases;
import java.util.Scanner;
import java.util.Arrays;

class Demo
{
  void pass(String str)
  {
	  char[]ch=str.toCharArray();
	  
	  Arrays.sort(ch);
	  System.out.println(ch);
  }
}
public class Testcase02 
{
	
   public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value");
		String str=sc.nextLine();
		
		Demo d1=new Demo();
		d1.pass(str);
		sc.close();
	}
}
