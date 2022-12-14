package testcases;
import java.util.Arrays;

public class Testcase29 //seperating even and odd num
{
  public static void main(String[] args)//
  {
	int []arr={5,9,1,3,2,8,7};//{1 2 3 5 6 7 8}
	int x=0;
	int[]res=new int[arr.length];
	Arrays.sort(arr);
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]%2!=0)
		{
			res[x]=arr[i];
			x++;
		}
	}
	for(int j=0; j<arr.length; j++)
	{
		if(arr[j]%2==0)
		{
			res[x]=arr[j];
			x++;
		}
	}
	for(int a=0; a<arr.length; a++)
	{
		System.out.print(res[a]+",");
	}
  }
}
