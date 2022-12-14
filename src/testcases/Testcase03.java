package testcases;
import java.util.Scanner;

class Sample
{
	void tcase(String str)
	{
		int count=0;
		char[]ch=str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			
			if(ch[i]!=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}
public class Testcase03 
{
   public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a String");
	String str=sc.nextLine();
	
	Sample s1=new Sample();
	s1.tcase(str);
	
	sc.close();
  }
}
