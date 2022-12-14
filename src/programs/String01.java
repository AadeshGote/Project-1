package programs;

import java.util.Arrays;

public class String01 
{
	static void array(String str)
	{
		char[] ch= str.toCharArray();
		   Arrays.sort(ch);
		   System.out.println(ch);
	}
 public static void main(String[] args) 
 {
   array("AADESH");
   
 }
}
