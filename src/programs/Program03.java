package programs;

public class Program03 
{
   static void array(int[]arr)
   {
	   int count=0;
	   for(int i=0; i<arr.length; i++)
	   {
		   if(arr[i]>10 && arr[i]<20)
		   {
		   count++;
		   }
	   }
	   System.out.println(count);
   }
   
   public static void main(String[] args) 
   {
	int []arr={0,1,5,7,9,11,14,18,36,42,57,71,92};
	
	array(arr);
   }
}
