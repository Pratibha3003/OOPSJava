package Inheritance;
class Parent
{
	 int id;
	 public void display()
	 {
		 System.out.println("Parent class display function");
	 }
}
class Child extends Parent
{
	public void display()
	 { 
		super.display();
		 System.out.println("child class display function");
	 }
}

public class OverrridingMethod {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child ob=new Child();
		ob.display();

	}

}
