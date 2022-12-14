package corejava;

class Demo1
{
	int a=10;
	static int count=0;
	static Demo1 d1;
	
	private Demo1()
	{
		count++;
	}
	
	public static Demo1 getInstance()
	{
		if(count<1)
		{
			d1=new Demo1();
		}
		return d1;
	}
	
	public static void setInstance(int x)
	{
		d1.a=x;
	}
}
public class Singleton 
{
  public static void main(String[] args) 
  {
	Demo1 d2=Demo1.getInstance();
	System.out.println(d2.a);
	
	Demo1 d3=Demo1.getInstance();
	System.out.println(d3.a);
	
	Demo1.setInstance(80);
	System.out.println(d2.a);
	System.out.println(d3.a);
  }
}
