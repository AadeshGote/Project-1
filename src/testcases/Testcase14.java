package testcases;
import java.util.Scanner;

class Parrot
{
  boolean talk(boolean talking, int hour)
  {
	  if(talking==true && hour<7 || hour>20)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
}
public class Testcase14 
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  for(int i=1; i<=3; i++)
	  {
	  System.out.println("Enter true or false and value");
	  boolean t=sc.nextBoolean();
	  int h=sc.nextInt();
	  
	  Parrot p1=new Parrot();
	 System.out.println(p1.talk(t,h));
	 System.out.println("**********************");
	  }
	  sc.close();
  }
}
