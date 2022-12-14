package testcases;
import java.util.Scanner;

public class Testcase26 // space and digit count
{
  public static void main(String[] args) 
  {
	char[]ch=new char[10];
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a string");
	String str=sc.nextLine();
	int spcount=0,digcount=0;
	if(str.length()==10)
	{
	  for(int i=0; i<str.length(); i++)
	  {
		ch[i]=str.charAt(i);
	
	     if(ch[i]==' ')
	     {
		  spcount++;
	     }
	     else if(ch[i]>='0'&&ch[i]<='9')
	     {
		  digcount++;
	     }
	  }
	}
	System.out.println("Number of space are "+spcount);
	System.out.println("Number of digits are "+digcount);
	sc.close();
  }
}
