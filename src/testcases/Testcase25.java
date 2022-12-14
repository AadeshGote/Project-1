package testcases;
import java.util.Scanner;
import java.util.Arrays;

public class Testcase25 // sort the characters
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	char[]ch=str.toCharArray();
	Arrays.sort(ch);
	System.out.println(ch);
	sc.close();	
  }
}
