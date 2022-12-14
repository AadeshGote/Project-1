package programAssignments;

public class Arrays03 //sum even and odd position numbers
{
 public static void main(String[] args) {
	 
	 int []arr={10,82,1,23,15,47};
	 int esum=0, osum=0;
	
	 for(int i=0; i<arr.length; i++)
	 {
		 if(i%2==0)
		 {
			 esum=esum+arr[i];
		 }
		 else
		 {
			 osum=osum+arr[i];
		 }
	 }
	 System.out.println("Even position sum is "+esum+"\n"+"Odd position sum is "+osum);
}
}
