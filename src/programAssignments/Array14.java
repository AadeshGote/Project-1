package programAssignments;

public class Array14 //count of even odd
{
 public static void main(String[] args) 
 {
	 int []arr={10,82,1,23,15,47};
	 int Ecount=0, Ocount=0;
	 for(int i=0; i<arr.length; i++)
	 {
		 int num=(arr[i]%2==0)?Ecount++:Ocount++;
		 System.out.println(num);
	 }
	 
	 System.out.println("Even count is "+Ecount+"\n"+"Odd count is "+Ocount);
 }
}
