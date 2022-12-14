package programAssignments;

public class Array23 //insert arr in an arr
{
 public static void main(String[] args) 
 {
	int[]arr={1,2,3,4,5};
	int[]ele={10,11,12,13};
	int index=3, x=0, y=0;
	int[]ans=new int[arr.length+ele.length];
	
	for(int i=0; i<ans.length; i++)
	{
		if(i>=index && i<index+ele.length)
		{
				ans[i]=ele[y];
				y++;
		}
		else
		{
	      ans[i]=arr[x];
	      x++;
		}
		System.out.println(ans[i]);
	}
 }
}
