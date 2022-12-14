package programAssignments;

public class Array16 
{
  public static void main(String[] args) 
  {
      int []arr={10,82,1,23,15,47};
      int prod =1;
      for(int i=0; i<arr.length; i++)
      {
    	  prod=prod*arr[i];
      }
      System.out.println(prod);
  }
}
