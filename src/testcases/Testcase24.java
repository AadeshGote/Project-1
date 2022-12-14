package testcases;
import java.util.Arrays;
import java.util.Scanner;

public class Testcase24 //2nd MAX AND MIN.
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter array size");
	int size=sc.nextInt();
	int[]arr= new int [size];
	
	System.out.println("Enter the values");
	
	for(int i=0;  i<size; i++)
	{
		arr[i]=sc.nextInt();
	}
	sc.close();
	Arrays.sort(arr);	
	System.out.println("Second min= "+arr[1]);
	System.out.println("Second max= "+arr[size-2]);
	
	
 }
}
