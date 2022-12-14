package programs;

public class Frequency 
{
	public static void main(String[] args) 
	 {	   	
	   	String str="aaabbccdddee";
	   	char[]ch=str.toCharArray();
	   	int[]fr=new int[ch.length];
	   	for(int i=0; i<str.length(); i++)
	   	{
	   		int count=1;
	   		for(int j=i+1; j<ch.length; j++)
	   		{
	   			if(ch[i]==ch[j])
	   			{
	   				count++;
	   				fr[j]=-1;
	   			}
	   		}
	   		if(fr[i]!=-1&&ch[i]!=' ')
	   		{
	   			fr[i]=count;
	   			System.out.println(ch[i]+"-->"+fr[i]);
	   		}
	   	}	   	
	 }
}
