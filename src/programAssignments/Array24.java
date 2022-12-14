package programAssignments;
import java.util.Scanner;
public class Array24 
{
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter array size");
	 int size=sc.nextInt();
	 int []arr=new int[size];
	//int x=0, y=size;
	 System.out.println("Enter array elements");
	 for (int i=0; i<size; i++) 
	 {
		 arr[i]=sc.nextInt();
	 }
	 
	 for(int j=0; j<arr.length; j++)
	 {
		 
	 }
   
     sc.close();
 }
}
