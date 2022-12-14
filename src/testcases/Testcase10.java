package testcases;
import java.util.Scanner;

class Sleepin
{
	public boolean day(boolean weekday, boolean vacation)
	{
		if(weekday!=true || vacation==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Testcase10 // weekday and vacation
{
   public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter true or false");
	boolean wd=sc.nextBoolean();
	boolean vc= sc.nextBoolean();
	
	Sleepin s1=new Sleepin();
	
	System.out.println(s1.day(wd,vc));/* IF WE ARE RETURNING SOMETHING
	                                     LIKE INT OR BOOLEAN, THEN JUST ACCESS
	                                     THE METHOD WITHIN THE PRINT STATEMENT
	                                     BUT IN RETURN VOID WE STORE THE
	                                     METHOD IN A REFERENCE VARIABLE
	                                     LIKE INT X=S1.DAY(WD,VC)
	                                     THEN SOP(X)*/
	sc.close();
	}
}
