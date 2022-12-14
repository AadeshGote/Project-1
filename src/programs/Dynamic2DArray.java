package programs;
import java.util.Scanner;

public class Dynamic2DArray 
{
 public static void main(String[] args) /*row wise and column wise sum*/
 {
   	Scanner sc=new Scanner(System.in);
   	
   	System.out.println("Enter number of rows");
   	int row=sc.nextInt();
   	System.out.println("Enter number of columns");
   	int col=sc.nextInt();
   	
   	int arr[][]=new int[row][col];
   	System.out.println("Enter "+row*col+" elements");
   	
   	for(int i=0; i<arr.length; i++)
   	{
   		for(int j=0; j<arr[i].length; j++)
   		{
   			arr[i][j]=sc.nextInt();
   		}
   	}
   	System.out.println("After Loading");
   	
   	for(int i=0; i<arr.length; i++)
   	{
   		for(int j=0; j<arr[i].length; j++)
   		{
   			System.out.print(arr[i][j]+" ");
   		}
   		System.out.println();
   	}
   	int sum=0;
   	for(int i=0; i<arr.length; i++)
   	{
   		for(int j=0; j<arr[i].length; j++)
   		{
   			if(i==0)
   			{
   		      sum=sum+arr[j][i];/*column wise sum*/
   		      /*sum=sum+arr[i][j] row wise sum*/
   			}
   		}
   	}
   		System.out.println(sum);
   	
   	sc.close();
 }
}
