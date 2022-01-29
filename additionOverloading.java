package Construct;

class Addition
{
	void add(int a,int b)
	{
		int addint=a+b;
		System.out.println("Addition of two integer values "+addint);
		
	}
	void add(byte a,byte b)
	{
		byte addbyte=(byte) (a+b);
		System.out.println("Addition of two byte values "+addbyte);
		
	}
	void add(short a,short b)
	{
		short addshort=(short) (a+b);
		System.out.println("Addition of two short values "+addshort);
		
	}
	void add(float a,float b)
	{
		float addfloat=a+b;
		System.out.println("Addition of two float values "+addfloat);
		
	}
}
public class additionOverloading {

	public static void main(String[] args)
	{
		Addition ob=new Addition();
		ob.add(5,4);
		ob.add(3,5);
		ob.add(3.2f,2.3f);
		ob.add(2,3);
		

	}

}
