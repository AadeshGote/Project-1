package programs;

public class MissingChar 
{
public static void main(String[] args) {
	char[]ch={'a','b','c','e'};
	for(int i=0; i<ch.length; i++)
	{
		if (ch[i]!=(char)(97+i)) 
		{
		System.out.println((char)(97+i)+"  char is missing");
		break;
		}
	}
}
}
