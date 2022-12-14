package corejava;

public class Armstrong 
{
  public static void main(String[] args) {
	
	  int no=407;
	  int copy=no;
	  int sum=0;
	  
	  
	  while(no!=0)
	  {
		  int rem=no%10;
		  int cube=0;
		  
		  cube =(rem*rem*rem);
		  
		  sum=sum+cube;
		  
		  no=no/10;
	  }
	  
	  if(copy==sum)
	  {
		  System.out.println(sum+" is armstrong number");
	  }
	  else
	  {
		  System.out.println(copy+" is not armstrong number");
	  }
}
}
