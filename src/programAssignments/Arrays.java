package programAssignments;

public class Arrays 
{
  public static void main(String[] args) 
  {
	int []arr={10,82,1,23,15,47};
	int sum=0;
	for(int i=0; i<arr.length; i++)
	{
		sum=sum+arr[i];
	}
	System.out.println(sum);
  }
}
