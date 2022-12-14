package programAssignments;

public class Array17 
{
  public static void main(String[] args) 
  {
	  int []arr={10,82,1,23,15,47};
	  int sum=0;
	  for(int i=0; i<arr.length; i++)
	  {  
		  int no=arr[i];
		  boolean flag=true;
		  
			  for(int j=2; j<no; j++)
			  {
				  if(no%j==0)
				  {
					  flag=false;
					  break;
				  }
			  }		
		  if(flag==true)
		  {
			  sum=sum+no;
		  }
	  }
		  System.out.println(sum);	  
  }
}
