package Construct;
class OverloadingFun
{
	void display()
	{
		System.out.println("Without argument ");
	}
	void display(int a)
	{
		System.out.println("with arguments");
	}
	void display(int a,Float d)
	{
		System.out.println("with different argument");
	}
	void display(float d,int a)
	{
		System.out.println("Changing data tpyes");
	}
}



public class FunctionOverloading {

	public static void main(String[] args) 
	{
		OverloadingFun ob=new OverloadingFun();
		ob.display();
		ob.display(10);
		ob.display(10,1.3f);
		ob.display(1.2f,5);
		

	}

}
