package EmployeePack;

public class EmployeeClassInOtherPAck
{
   private int id;
   String empname;
   protected float sal;
   public String cmpname;
   public EmployeeClassInOtherPAck(int id, String empname, float sal, String cmpname) {
	super();
	this.id = id;
	this.empname = empname;
	this.sal = sal;
	this.cmpname = cmpname;
		}
   
   
}
/*class Company extends EmployeeClassInOtherPAck
{
	void display()
	{
		System.out.println("Protected cmp name" +sal);
		System.out.println("Public "+cmpname);
	}
}
*/