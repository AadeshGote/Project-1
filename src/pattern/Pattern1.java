package pattern;

public class Pattern1 {
	public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		    for(int k=5-i;k>0;k--)
		     {
			  System.out.print(" ");
		     }
		for(int j=(i+i)-1;j>0;j--)
		 {
			if(i==j)
			{
				System.out.print(" ");
			}
			else{
			System.out.print("*");
		 }}
		System.out.println();
	}
	}

}
