package pattern;

public class Butterfly 
{
  public static void main(String[] args) 
  {
	int n=7;
	int space=n-2;
	int star=1;
	
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=star; j++)
		{
			System.out.print("*");
		}
		for(int k=1; k<=space; k++)
		{
			System.out.print(" ");
		}
		for(int l=star; l>=1; l--)
		{
			if(l<=n/2)
			{
			System.out.print("*");
			}
		}
		System.out.println();
		if(i<=n/2)
		{
			space=space-2;
			star++;
		}
		else
		{
			space=space+2;
			star--;
		}
	}
  }
}
