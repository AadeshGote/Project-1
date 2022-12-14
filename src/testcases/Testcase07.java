package testcases;

public class Testcase07 
{
 public static void main(String[] args) 
 {
	String str="I love java";
	String[] str1= str.split(" ");
	String rev=" ";
	
	for(int i=str1.length-1; i>=0; i--)
	{
		rev=rev+str1[i]+" ";
	}
	System.out.println(rev);
	 
 }
}
