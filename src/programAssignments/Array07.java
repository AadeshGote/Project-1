package programAssignments;

public class Array07 //small and big element in array
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
	System.out.println("Lowest value is "+arr[0]);
	System.out.println("Highest value is "+arr[arr.length-1]);
  }
}
