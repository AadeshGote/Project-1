package corejava;

public class Perfect_number 
{
  public static void main(String[] args) 
  	{
	  for(int j=1; j<=100; j++)
	  {
	int no=j;
	int copy=no;
	int sum=0;
	
	  for(int i=1; i<=no/2; i++)
	  {
		  if(no%i==0)
		  {
			 sum=sum+i; 
		  }
	  }
	  
	  if(copy==sum)
	  {
		  System.out.println(sum+" is perfect number");
	  }
	 /* else
	  {
		  System.out.println(copy+" is not perfect number");
	  }*/
  	}
  	}
}
