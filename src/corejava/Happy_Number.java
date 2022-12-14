package corejava;

public class Happy_Number 
{
  public static void main(String[] args) 
  {
	int no=23;
	int sq=0;
	int sum=0;
	
	while(no!=0)
	{
		int rem=no%10;
		sq=(rem*rem);
		sum=sum+sq;
		
		no=no/10;
		System.out.println(sum);
	}
	
  }
}
