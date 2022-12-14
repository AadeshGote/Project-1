package programs;

public class Split_revString 
{

 public static void main(String[] args) 
 {
	String str="I love Java";
	String[]str1=str.split(" ");
	String rev="";
	
	for(int i=str1.length-1; i>=0; i--)
	{
		System.out.println(str1[i]);
		rev=rev+str1[i]+" ";
	}
	System.out.println(rev);
	
 }
}
