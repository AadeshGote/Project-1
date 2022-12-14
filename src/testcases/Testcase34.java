package testcases;

public class Testcase34 
{
 public static void main(String[] args) 
 {
	 int sum=0;
  int[]arr={7,9,10,8,16};
  for(int i=0; i<arr.length; i++)
  {
	  if(i%2==0)
	  {
		  sum+=arr[i];
	  }
  }
  System.out.println(sum);
 }
}
