package programs;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram02 
{
	static void gram(String str1, String str2)
	{
		//String str1="BAT";
	      //String str2="EFGR";
	      boolean flag=true;
	      
	      if(str1.length()==str2.length())
	      {
	    	  char[]ch1=str1.toCharArray();
	    	  char[]ch2=str2.toCharArray();
	    	  
	    	  Arrays.sort(ch1);
	    	  Arrays.sort(ch2);
	    	  
	    	  for(int i=0; i<ch1.length; i++)
	    	  {
	    		  if(ch1[i]!=ch2[i])
	    		  {
	    			  flag=false;
	    			  break;
	    		  }
	    	  }
	    	  if(flag==true)
	    	  {
	    		  System.out.println("it is anagram");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("it is not anagram");
	    	  }
	      
	      }
	      else
	      {
	    	  System.out.println("String does not match");
	      }
	}
 public static void main(String[] args) 
 {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter a value");
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      
      gram(str1,str2);
      sc.close();
 }
}
