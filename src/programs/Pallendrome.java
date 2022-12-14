package programs;

public class Pallendrome 
{
 public static void main(String[] args) 
 {
   int []arr={121,146,721,171,23632};
   
   for(int i=0; i<arr.length; i++)
   {
	   int rev=0;
	   int copy= arr[i];
	   
	   while(arr[i]!=0)
	   {
		   int rem=arr[i]%10;
		   
		   rev=(rev*10)+rem;
		   
		   arr[i]=arr[i]/10;
	   }
	   if(copy==rev)
	   {
		   System.out.println(copy+" is a pallendrome of "+rev);
	   }
	   else
	   {
		   System.out.println(rev+" is not pallendrome of "+copy);
	   }
   }
 }	
}
