package corejava;

public class Neon 
{
 public static void main(String[] args) {
	
	 int no=5;
	 int copy=no;
	 int sum=0;
	 int sq=(no*no);
	 
	 while(sq!=0)
	 {
		 
		 int rem=sq%10;
		 sum=sum+rem;
		 sq=sq/10;
	 }
	 if(copy==sum)
	 {
	 System.out.println(sum+" is neon");
	 }
	 else
	 {
		 System.out.println(copy+" is not neon");
	 }
}
}
