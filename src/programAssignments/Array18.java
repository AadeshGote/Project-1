package programAssignments;

public class Array18 
{
  public static void main(String[] args) 
  {
	  int []arr={10,82,1,23,15,47};
	  int sum1=0;
	  for(int i=0; i<arr.length; i++)
	  {
		  int no=arr[i];
		  int fact=1;
		  int sum=0;
		  while(arr[i]!=0)
		  {
			  
			  int rem=arr[i]%10;
			  for(int j=rem; j>=1; j--)
			  {
				  fact=fact*j;
				  sum=sum+fact;
				  
			  }		  
			  arr[i]=arr[i]/10;
		  }
		 
		  if(sum==no)
		  {
			 sum1=sum1+sum;
		  }		 
	  }
	  System.out.println(sum1);
  }
}
