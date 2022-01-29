package Inheritance;


abstract class Shape
{
	String color;
	abstract double area();
	double area(double side) {
		// TODO Auto-generated method stub
		return 0;
	}
	double area(int side) {
		// TODO Auto-generated method stub
		return 0;
	}
	public abstract String toString();
	
	public Shape(String color)
	{
		System.out.println("Shape Constructor called");
		this.color=color;
	}
	public String getColor()
	{
		return color;

	}

}
class Circle extends Shape
{
	double radius;
	public Circle(String color,double radius)
	{
		super(color);
		System.out.println("Circle constructor called");
		this.radius=radius;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is " + super.getColor()
		+ "and area is : " + area();
	}
}
class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length,
					double width)
	{
		
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() { 
		return length * width; 
		}

	@Override 
	public String toString()
	{
		return "Rectangle color is " + super.getColor()
			+ " and area is : " + area();
	}
}

class Square extends Shape
{
	
	double side;
	public Square(String color,double side)
	{
		super(color);
		System.out.println("Square constructor called");
		
		this.side=side;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square color is " + super.getColor()
		+ " and area is : " + area();
	}

	@Override
	double area( double side) {
		// TODO Auto-generated method stub
		return side*side;
	}



	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class AbstractExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);
		Shape s3 = new Square("Orange",5);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());


	}
}
