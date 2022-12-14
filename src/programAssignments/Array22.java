package programAssignments;

public class Array22 //insert no in middle
{
	public static void main(String[] args) 
	{
    int []arr={1,2,3,4,5,6,7};
    int ans[]=new int[arr.length+1];
    int index=3, el=1000, x=0;
    
     for(int i=0; i<ans.length; i++)
     {
    	 if(i==index)
    	 {
    		
    		 ans[i]=el;
    	 }
    	 else
    	 {
    		 ans[i]=arr[x];
    		 x++;
    	 }
    	 System.out.println(ans[i]);
     }
   
	}
    
}
