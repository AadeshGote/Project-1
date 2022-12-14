package programs;

public class Missing02 
{
 public static void main(String[] args) 
 {
	 int sum=0;
	 int sum1=0;
	int []arr={1,2,3,4,5,6,8,9,10};
	
	
	for(int i=0; i<arr.length; i++)
	{
		sum=sum+arr[i];
		
	}
	
		
		
	for(int i=1; i<=10; i++)
	{
	
	sum1=sum1+i;
	}
	System.out.println(sum1-sum+" IS MISSING");
	
 }
}
