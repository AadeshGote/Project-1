package testcases;
import java.util.Scanner;

public class Testcase08 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENTER ARRAY SIZE");	
	int size=sc.nextInt();
	int[]arr=new int[size];
	
	System.out.println("ENTER VALUES");
	
	for(int i=0; i<size; i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int j=0; j<arr.length; j++)
	{
		System.out.print(arr[j]+" ");
	}
	sc.close();
  }
}
