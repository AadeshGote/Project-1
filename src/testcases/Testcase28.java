package testcases;
import java.util.Scanner;

public class Testcase28 //Happy Number
{
 public static void main(String[] args) 
 {
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter a number");
	 int no=sc.nextInt();
     
   while(no>9)
   {
	   int sum=0;
	   do
	   {
		   int rem=no%10;
		   sum=sum+(rem*rem);
		   no=no/10;
		   
	   }while(no!=0);
	   no=sum;
   }
    
   System.out.println(no);
   if(no==1 || no==7)
     System.out.println("it is happy number");
   
   else
	   System.out.println("it is not a Happy number");
 sc.close();
 }
}
