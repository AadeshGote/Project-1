package corejava;

public class Ascii_value 
{
 public static void main(String[]args)
 {
	 int n1=65;
	 int n2=97;
	 int n3=1;
	 
	 for(int i=1; i<=26; i++)
	 {
		 char ch1= (char)n1;
		 char ch2=(char)n2;
		 
		 System.out.println(ch1+" "+ch2+" "+n3);
		 
		 n1++;
		 n2++;
		 n3++;
	 }
 }
}
