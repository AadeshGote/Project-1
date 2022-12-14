package corejava;

public class Reverse_number 
{
 public static void main(String[] args) {
	
	 int no=1234;
	 int copy=no;
	 int rev=0;
	 
	 while(no!=0)
	 {
		 int rem=no%10;
		 
		 rev=rev*10+rem;
		 
		 no=no/10;
	 }
	 if(copy==rev)
	 {
		 System.out.println(copy+" is reverse of "+rev);
	 }
	 else
	 {
		 System.out.println(rev+" is not reverse of "+copy);
	 }
}
}
