package Inheritance;


abstract class Animal
{
	void sleep()
	{
		System.out.println("ZZZzzzz");
	}
	public abstract void eat();
}
class Cow extends Animal
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Cow eats grass");
	}
	void feature()
	{
		System.out.println("Cow's color is white");
	}
	
}
public class MainAbractMethod 
{
	public static void main(String[] args)
	{
		Cow ob1=new Cow();
		ob1.sleep();
		ob1.eat();
		ob1.feature();
		System.out.println("***");
		Animal ob=new Cow();
		ob.sleep();
		ob.eat();
		ob1.feature();
		
	}
}
