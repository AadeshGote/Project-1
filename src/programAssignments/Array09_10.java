package programAssignments;

public class Array09_10 //even odd numbers & position numberss
{
 public static void main(String[] args) 
 {
	 int []arr={10,82,1,23,15,47};
	 
	 for(int i=0; i<arr.length; i++)
	 {
		 if(i%2==0)
		 {
			 System.out.println(arr[i]+" is even position number");
		 }
		 else
		 {
			 System.out.println(arr[i]+" is odd position number");
		 }
	 }
 }
}
