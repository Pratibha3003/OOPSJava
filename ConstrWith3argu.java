package Construct;



class Student
{
	int id;
	String sname;
	static String cname;
	Student(int id,String sname)
	{
		this.id=id;
		this.sname=sname;
	}
	Student(Student s)
	{
		this.id=s.id;
		this.sname=s.sname;
	}
	void Display()
	{
		System.out.println("Student Id-> "+id);
		System.out.println("Student Name-> "+sname);
		System.out.println("Student College Name-> "+cname);
	}
	
	static 
	{
	cname="WIT";
	}
	
	
	
}



public class ConstrWith3argu {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Pratibha");
		Student s2=new Student(s1);
		s1.Display();
		s2.Display();

	}

}
