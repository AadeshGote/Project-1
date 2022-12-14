package testcases;

public class Testcase05 
{
   public static void main(String[] args) 
   {
	String str="hello how are you";
	char[]ch=str.toCharArray();
	
	for(int i=0; i<ch.length; i++)
	{
		String str1="";
		
		while(i<ch.length && ch[i]!=' ')
		{
			str1=str1+ch[i];
			i++;
		}
		if(str1.length()>0)
		{ 
			System.out.println(str1+ " "+str1.length()+" ");
		}
	}
   }
}
