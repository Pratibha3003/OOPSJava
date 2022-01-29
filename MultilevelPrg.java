package Inheritance;
class  A 
{
	private int id;
	public float salary;
	A(int id)
	{
		this.id=id;
	System.out.println("Super class A "+id);
	}
}
class B extends A
{
	B( int id,float sal)
	{
		super(id);
		this.salary=sal;
	System.out.print("sub  class B  and ");
	System.out.println("Salary is "+sal);
	}
}
class C extends B
{
	C(int id,float sal)
{
		super(id,sal);
System.out.println("class C");
}
}
public class MultilevelPrg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		C ob=new C(25,245.6f);
	}

}
