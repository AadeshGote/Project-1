package programs;

public class Missingnum 
{
public static void main(String[] args) 
  {

	int []arr={1,2,3,4,5,6,8,9,10};
	 
	for(int i=0; i<arr.length; i++)
	{
	   if(arr[i]+1-arr[i]==1)
	   {
		   System.out.println(arr[i]+" not missing");
	   }
	   else //if(arr[i+1]-arr[i]==2)
	   {
		   System.out.println(" is missing");
	   }
	  
	}
 }
}
