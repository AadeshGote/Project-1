package programs;
import java.util.Scanner;
public class Special2dig 
{
 public static void main(String[] args) 
 {
  	Scanner sc=new Scanner(System.in);
  	System.out.println("ente a number");
  	int no=sc.nextInt();
  	int copy=no;
  	int ans=0;
  	
  		int d1=no%10;
  		int d2=no/10;
  		ans=d1+d2+(d1*d2);
  		
      String str=(copy==ans)?"special":"not special";
  		System.out.println(str);
  	sc.close();
 }
}
