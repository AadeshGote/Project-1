package testcases;

public class Testcase33 //sum of the elements
{
 public static void main(String[] args) 
 {
	 int sum=0;
     char[]ch={'0','1','5','8','3'};	
     for(int i=0; i<ch.length; i++)
     {
    	 int x=(int)(ch[i]-48);
    	 sum+=x;
     }
     System.out.println(sum);
 }
}
