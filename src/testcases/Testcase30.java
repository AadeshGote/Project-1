package testcases;

public class Testcase30 
{
 public static void main(String[] args) 
 {
  int[]arr={1,2,3,4,5};
  int fact=1;
  for(int i=0; i<arr.length; i++)
  {
	  fact*=arr[i];
  }
  for(int j=0; j<arr.length; j++)
  {
	  	System.out.print(fact/arr[j]+",");
  }
 }
}
