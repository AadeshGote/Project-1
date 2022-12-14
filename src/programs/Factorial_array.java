package programs;

public class Factorial_array 
{
 public static void main(String[] args) {
	
	 int []arr={121,146,421};
	 for(int i=0; i<arr.length; i++)
	 {
		 int no=arr[i];
		 while(no!=0)
		 {
			 int fact=1;
			 int rem=no%10;
		   for(int j=rem; j>=1; j--)
			 {
				 fact=fact*j;
			 }
		   System.out.println(fact);
		   no=no/10;
		 }
			
	 }
}
}
