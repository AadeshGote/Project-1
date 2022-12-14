package programs;

public class FibandFact 
{
public static void main(String[] args) 
 {
	int[]arr={8134, 25652, 6381, 2675, 13531};
	
	 for(int i=0; i<arr.length; i++)
	 {
		 int no=arr[i];
		 int copy=no;
		 int sum=0;
		 int rev=0, rev1=0;
		 while(no!=0)
		 {
			 int rem=no%10;
			 rev=(rev*10)+rem;
			 no=no/10;
			 sum=sum+rem;
			 //System.out.println(sum);
		 	 
		 }
		
		 
		 while(sum!=0)
		 {
			 int rem1=sum%10;
			 rev1=(rev1*1)+rem1;
			 sum=sum/10;
			 
		 }
		 //System.out.println(rev1);
			 //System.out.println("///////////");
	  
			if(copy==rev)
			{
				
				System.out.println(arr[i]+"  is a pallendrome, so find fact");
				int fact=1;
				for(int j=rev1; j>=1; j--)
				{
					fact=fact*j;
				}
				System.out.println(fact);
				System.out.println("**********************************************");
			}
			
			else
			{
				
				System.out.println(arr[i]+" is not pallendrome, so find fibonacci");
                System.out.println("**********************************************");
				int f1=0, f2=1;
				int f3;
				System.out.print(f1+" ");
				
				for(int k=0; k<=rev1; k++)
				{
					f3=f1+f2;
					f1=f2;
					f2=f3;
					System.out.println(f3+" ");
				}
				System.out.println("----------------------------------------");
			}
	 }
		 
				 
	 
	
 }
 }
