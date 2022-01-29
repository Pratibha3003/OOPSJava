package Construct;

class MyConstsr
{
	int a,b,k,l,i,j,n;


	MyConstsr(int a,int b) 
	{
		System.out.println(" a-> "+a+" b-> "+b);
	}

	 MyConstsr(int k,int l,int n) 
	{
			System.out.println("k: "+k+" l: "+l+" n: "+n);
	}
	void LargestNo(int i,int j) 
	{
		int l=i>j?i:j;
		System.out.println("Largest Number "+l);
	}
	void LargestThreeNo(int k,int l,int n) 
	{
		int lar=(k>l && k>n)?k:(l>k && l>n)?l:n;
		System.out.println("Largest Number "+lar);
	}


}
public class ConstructorrEx {

	public static void main(String[] args) 
	{
		//MyConstsr1 ob=new MyConstsr1();
		MyConstsr ob1=new MyConstsr(5,10);
		MyConstsr ob3=new MyConstsr(2,4,6);
		ob1.LargestNo(6,7);
		ob3.LargestThreeNo(12,3,4);

	}
}	
