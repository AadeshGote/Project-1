package testcases;

public class Testcase17 
{
 public static void main(String[] args) 
 {
	String str="J#a##v#a##";
	String str1="";
	String str2="";
	char[]ch=str.toCharArray();
	
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]=='#')
		{
			str1=str1+ch[i];
		}
		else
		{
			str2=str2+ch[i];
		}
	}
	System.out.println(str1+str2);
 }
}
