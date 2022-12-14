package programAssignments;

public class Array05 //sort arr in descending order
{
 public static void main(String[] args) 
 {
	 int []arr={10,82,1,23,15,47};
	 
	 for(int i=0; i<arr.length; i++)
	 {
		 for(int j=0; j<arr.length; j++)
		 {
			 if(arr[i]<arr[j])
			 {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
			 
		 }
		 
	 }
	 for (int i =arr.length-1; i >=0;  i--) {
		System.out.print(arr[i]+" ");
	}
 }
}
