package testcases;
import java.util.Scanner;

public class Testcase27 // Password
{
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter a Password");
	  String str=sc.nextLine();
	  
	  int Ucount=0, Lcount=0, Ncount=0, Scount=0;
	  if(str.length()>=8 && str.length()<=12)
	  {
		  
		  for(int i=0; i<str.length(); i++)
		  {
			  char ch=str.charAt(i);
			  if(ch>='A' && ch<='Z')
			  {
			      Ucount++;
			  }
			  else if(ch>='a'&& ch<='z')
			  {
				  Lcount++;
			  }
			  else if(ch>='0' && ch<='9')
			  {
				  Ncount++;
			  }
			  else
			  {
				  Scount++;
			  }
		  }
		  System.out.println(Ucount+"\n"+Lcount+"\n"+Ncount+"\n"+Scount);
		  if(Ucount>=1 && Lcount>=1&& Ncount>=1&& Scount>=1 && str.endsWith("#"))
		  { 
			  System.out.println("Password Accepted");
		  }
		  else
		  { 
			  System.out.println("Invalid Password");
			}
	  }
	  else
		  {
		  System.out.println("Password must have 8-12 characters");
		  }
	  sc.close();
}
}
