package Construct;

import java.io.BufferedReader;
import java.nio.Buffer;

class Area
{
//	int r=4,a=4;
	   
	   void reactangleArea()
	   {
	     //input and display here
		   int l=10,b=5;
		   int ar=l*b;
		   System.out.println("Area of Reactangle "+ar);
		   
		  
	   }
	   
	   float circleArea(float r)
	   {
	     //only calculation
		 //  float arc=2*2.34f*r;
		 // System.out.println("Area of circle "+ arc); 
		   return 2*2.34f*r;
		   
		   
	   }
	   
	  int squareArea(int l)
	  {
	    //do only calculation and return area
		int  sqar=l*l;
		//System.out.println("Area of square "+ sqar);
		return sqar;
		
	  }
}

	


public class ReturnExample {

	public static void main(String[] args) {
		/* create an object Area
		   and call the functions
		   input data from user use bufferedreader class
		  */
		
		//	BufferedReader br=new BufferedReader(new InputStreamreader(System.in));
		
Area ob=new Area();

			System.out.println("Area of square "+ob.squareArea(4));
		    ob.reactangleArea();
			System.out.println("Area of Circle "+ ob.circleArea(4.0f));
			
	}

}
