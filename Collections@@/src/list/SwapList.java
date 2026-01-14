package list;

import java.util.ArrayList;
import java.util.Collections;

public class SwapList
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> ob1=new ArrayList<String>();
		
		
		ob1.add("Tiger");
		ob1.add("Lion");
		ob1.add("Dinosaur");
		ob1.add("cheetah");
		ob1.add("Elephant");
		
		System.out.println("Before swap:"+ob1);
	
		/*   This is one way to swap 
		
		Collections.swap(ob1,1,3);
		System.out.println(" swap:"+ob1);
		
		*/
		
		// Another way 
		
		
		   int index1  =  1;
		   
		 int index3 =3;
		   
		   
		   
		             String temp  = ob1.get(1);
		
		            ob1.set(index1 , ob1.get(3));
		             
		             ob1.set(index3, temp);
		     
		     
		             System.out.println("After swapping the elements"+ob1);
		  
		
	}

}
