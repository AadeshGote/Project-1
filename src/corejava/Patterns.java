package corejava;

public class Patterns 
{
  public static void main(String[] args) 
  {
	for(int i=4; i<=5; i++) // for selecting a number.
	{
		for(int j=1; j<=5; j++) // for performing iterations on selected number.
		{
			if(i>=j)
			{
			System.out.print(j);
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
  }
}
