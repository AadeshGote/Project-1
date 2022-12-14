package programs;
import java.util.Scanner;

public class Happy_num 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
    int no=sc.nextInt();
      
    while(no>9)
    {
    	int sum=0;
    	do{
    	  int rem=no%10;
    	  sum+=(rem*rem);
    	  no=no/10;
    	}while(no!=0);
    	no=sum;
    }
   String str=(no==1||no==7)?"happy":"not happy";
    System.out.println(str);
    sc.close();
  }
}
