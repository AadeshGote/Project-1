package testcases;

import java.util.Arrays;

public class Testcase32 //O/P-->1,16,17,18,26
{
  public static void main(String[] args) 
  {
	char[]ch={'Z','Q','R','A','P'};
	Arrays.sort(ch);
	System.out.println(ch);
	for(int i=0; i<ch.length; i++)
	{
		int x=(int)(ch[i]-64);
		System.out.println(x);
	}
  }
}
