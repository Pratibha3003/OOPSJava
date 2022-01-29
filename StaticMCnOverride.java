package Inheritance;

 {



 class Parent1{
	int id=123;;
	static String cname="ABC";
	
	public static void display() { 
		System.out.println(" Parent class display function");
		System.out.println("Static method method only access static data "+cname);
	}
	public void non_staticmethod()
	{
		System.out.println("Static data is access "+cname);
		System.out.println("non Static data is access "+id);
	}
}

class Child1 extends Parent1{
	int k;
	/*public  void display() { //static method cannot be overriden
	 //static method are inheritated you can use it with ref to class or object
		
		System.out.println("child class display function");
		
	}*/
	void child_function() {
		System.out.println("child_function");
	}
}
public class StaticMCnOverride {
	public static void main(String[] args) {
		Parent ob = new Parent();
		Parent.display();
		ob.display();
		child.display();
		child cob = new child();
		cob.display();
		cob.non_static_mathod();
		}
}

