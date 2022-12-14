package testcases;

public class Testcase04 
{
  public static void main(String[] args) 
  {
	String str="hello how are you";
	
	int count=0;
	for(int i=0; i<str.length(); i++)
	{
		if(str.charAt(i)!=' ')
		{
			count++;
		}
	}
	System.out.println(count);
  }
}
