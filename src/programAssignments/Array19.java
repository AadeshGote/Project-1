package programAssignments;

public class Array19 //sum of perfect
{
 public static void main(String[] args) 
 {
	 int []arr={10,82,1,23,15,47};
	 int sum=0, sum1=0;
	 for(int i=0; i<arr.length; i++)
	 {
		 int copy=arr[i];
		 for(int j=1; j<arr[i]/2; j++)
		 {
			 if(arr[i]%j==0)
			 {
				 sum=sum+arr[i];
				 
			 }
			 
		 }
		 System.out.println(sum);
		 if(sum==copy)
		 {
			 sum1=sum1+sum;
		 }
	 }
	 System.out.println(sum1);
 }
}
