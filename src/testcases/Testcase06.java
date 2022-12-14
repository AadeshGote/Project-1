package testcases;

public class Testcase06 // character occurances.
{
  public static void main(String[] args) 
  {
	String str="1213jspiders@gmail";
	//        0 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 
	//       |1|2|1|3|j|s|p|i|d|e|r|s|@|g|m|a|i|l|
	
	int[]arr=new int[122];
	
	   for(int i=0; i<str.length(); i++)
	   {
		   char ch=str.charAt(i);
		   arr[ch]++;
		   
	   }
	   for(int i=0; i<arr.length; i++)
	   {
		   if(arr[i]!=0)
		   {
			   System.out.println((char)(i)+" "+arr[i]);
		   }
	   }
  }
}
