package programs;
import java.util.Scanner;
public class Xylem_Phloem 
{
 public static void main(String[] args) 
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   int no=sc.nextInt();//1223
   int copy=no;
   int Isum=0;
   int Osum=0;
   while(no!=0)
   {
	   if(no==copy||no<=9)
	   {
		   Osum+=no%10;
	   }
	   else
	   {
		   Isum+=no%10;
	   }
	   no=no/10;
   }
   String str=(Isum==Osum)?"Xylem":"Phloem";
   System.out.println(str);
   sc.close();
 }
}
