package testcases;

public class Testcase31// sum of prime 
{
 public static void main(String[] args) 
 {
          int []arr={1,2,3,8,6,13};	
          int sum=0;
          for(int i=0; i<arr.length; i++)
          {
        	  
        	  int no=arr[i];
        	  boolean flag=true;
        	  for(int j=2; j<no; j++)
        	  {
        		  if(no%j==0)
        		  {
        			  flag=false;
        			  break;
        		  }
        	  }
        	  if(flag==true)
        	  {
        		  sum+=arr[i];  
        	  }
          }
          System.out.println(sum);
 }
}
