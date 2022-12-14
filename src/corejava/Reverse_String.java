package corejava;

public class Reverse_String {
public static void main(String[] args) {
	
	String str="JAVA";
	String rev="";
	
	for(int i=str.length()-1; i>=0; i--)
	{
		System.out.println(str.charAt(i));
		rev= rev+str.charAt(i);
	}
	
	if(str.equals(rev))
	{
		System.out.println(rev+" is pallendrome of "+str);
	}
	else
	{
		System.out.println(rev+" is not pallendrome of "+str);
	}
}
}
