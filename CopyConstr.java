package Construct;

class CopyMyConstr
{
	int i,j;
	CopyMyConstr(int i,int j)
	{
		this.i=i;
		this.j=j;
		System.out.println("First Object: "+this.i);
		System.out.println("First Object: "+this.j);
	}
	public CopyMyConstr(CopyMyConstr firstobj)
	{
		this.i=firstobj.i;
		this.j=firstobj.j;
		System.out.println("Second Object: "+this.i);
		System.out.println("Second Object: "+this.j);
	}
}


public class CopyConstr {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CopyMyConstr firstobj=new CopyMyConstr(10,20);
		
		CopyMyConstr secobj=new CopyMyConstr(firstobj);
	}

}
