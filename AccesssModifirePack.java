package AccessModifiresWiPackages;

import EmployeePack.EmployeeClassInOtherPAck;

class AccesssModifirePackclass 
{
	String name;
	public String cname;
	protected float fees;
	private int id;

	public AccesssModifirePackclass(String name, String cname,float fees, int id) {
		super();
		this.name = name;
		this.cname = cname;
		this.fees=fees;
		this.id = id;
	}
	class Company extends EmployeeClassInOtherPAck
	{
		public Company(int id, String empname, float sal, String cmpname) {
			super(id, empname, sal, cmpname);
			// TODO Auto-generated constructor stub
		}

		void display()
		{
			System.out.println("Protected cmp name" +sal);
			System.out.println("Public "+cmpname);
		}
	}
}	
	public class AccesssModifirePack 
	{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AccesssModifirePackclass  ob=new AccesssModifirePackclass ("WIT","Pratu",100.5f,12);
		System.out.println("College name "+ob.cname);
		System.out.println("Nameb of student "+ob.name);
		System.out.println("fees of student "+ob.fees);
	//	System.out.println("Id of student "+ob.id); private
		EmployeeClassInOtherPAck ob1=new  EmployeeClassInOtherPAck(123,"Pratu",2000.5f,"Wipro");
		
	//	System.out.println("Id "+ob1.id);private
//		System.out.println("Name "+ob1.empname);default
//System.out.println("salary "+ob1.sal);
System.out.println("Compnay name "+ob1.cmpname); 
	}
	}

