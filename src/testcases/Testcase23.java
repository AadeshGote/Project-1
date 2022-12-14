package testcases;

public class Testcase23 //SECOND MINIMUM
{
 public static void main(String[] args) 
 {
	int[]arr={5,2,3,1,4};
	int min=arr[0];
	int secondmin=0;
	
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]<min)
		{
			secondmin=min;
			min=arr[i];
		}
		else if(arr[i]<secondmin)
		{
			secondmin=arr[i];
		}
	}
	System.out.println(secondmin);
 }
}
