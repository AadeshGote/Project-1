package object_class;

public class Equals_method 
{
	 int empid;
	 
	 Equals_method(int empid)
	 {
		 
		 this.empid=empid;
		 
	 }
	 public boolean equals(Object obj)
	 {
		 Equals_method e2=(Equals_method)obj;
		 System.out.println(this.empid);
		 System.out.println(e2.empid);
		 return ((this.empid==e2.empid));
	 }

 public static void main(String[] args) 
 {
	 Equals_method e1=new Equals_method(1234);//this
	 Equals_method e2= new Equals_method(9875);
 
   if(e1.equals(e2))
   {
	   System.out.println("it is same");
   }
   else
   {
	   System.out.println("it is not same");
   }
 }
}
