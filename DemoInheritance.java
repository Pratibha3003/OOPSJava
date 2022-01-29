package Inheritance;

import java.util.Scanner;

class EduStudent
{
	public int age;
	public String name;
	public float fees;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of student");
		name=sc.nextLine();
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("Enter the fees amount");
		fees=sc.nextFloat();
		
		
	}
	
	public void display()
	{
		System.out.println("Student name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student fees is "+fees);
		
	}
}	

/*class NewStudent extends Edustudent

{
	public void student()
	{
		System.out.println("Enter new students details");
		
	}
	
}
*/
public class DemoInheritance
{

	public static void main(String[] args) 
	{
	 	
		EduStudent ob=new EduStudent();
		ob.accept();
		ob.display();
	}

}
