package testcases;
import java.util.Scanner;

 class Animals
{
	boolean monkey(boolean asmile, boolean bsmile)
	{
		if(asmile==true&&bsmile==true||asmile==false&&bsmile==false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Testcase11 // MONKEYS
{
	public static void main(String[] args) 
	{	
     Scanner sc=new Scanner(System.in);
  
      System.out.println("Enter true or false");
      boolean a=sc.nextBoolean();
      boolean b=sc.nextBoolean();
  
  Animals a1= new Animals();
    System.out.println(a1.monkey(a,b));
      sc.close();
	}
}
