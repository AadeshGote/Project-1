package programs;
import java.util.HashSet;

public class Panagram_shortcut 
{
  public static void main(String[] args) 
  {
	String str="abcdefghijklmnopqrstuvwxyz";
	str=str.toLowerCase();
	HashSet<Character> h1=new HashSet<Character>();
	
	if(str.length()>=26)
	{
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='a'&&ch<='z')
			{
				h1.add(ch);
			}
		}
		if(h1.size()==26)
		{
			System.out.println("It is a panagram");
		}
		else
		{
			System.out.println("It is not a panagram");
		}
	}
	else
	{
		System.out.println("It is not a panagram");
	}
  }
}
