package programAssignments;

public class Arrays02 // sum of even odd elements
{
 public static void main(String[] args) {
	
	 int []arr={10,82,1,23,15,47};
	 int esum=0;
	 int osum=0;
	 for(int i=0; i<arr.length; i++)
	 {
		 if(arr[i]%2==0)
		 {
			 esum=esum+arr[i];
		 }
		 else
		 {
			 osum=osum+arr[i];
		 }
	 }
	 System.out.println("Even sum is "+esum+"\n"+"Odd sum is "+osum);
}
}
