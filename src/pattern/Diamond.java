package pattern;

public class Diamond 
{
 public static void main(String[] args) 
 {
    int n=7;
    int star=1;
    int space=n/2;
    char ch=(char)65;
    for(int i=1; i<=n; i++)/*1*/
    {
    	for(int j=1; j<=space/*3*/; j++)
    	{
    		System.out.print("-");
    	}
    	for(int k=1; k<=star/*1*/; k++)
    	{
    		System.out.print(ch);
    		ch++;
    	}
    	
    	System.out.println();
    	
    	if(i<=n/2)
    	{
    		star=star+2;
    		space--;
    	}
    	else
    	{
    		star=star-2;
   		    space++;/*if we give break; here instead of star abd space,
   		               we will get pyramid */ 	
    	}
    }
 }
}
