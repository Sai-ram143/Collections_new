package list;

import java.util.ArrayList;
import java.util.Collections;

public class CopyListToList {

	public static void main(String[] args) 
	{
		ArrayList<String> Alist1=new ArrayList<String>();
		
	     	Alist1.add("a");
		    Alist1.add("b");
	    	Alist1.add("c");
		    Alist1.add("d");
	      	Alist1.add("e");
		
		ArrayList<String> Alist2=new ArrayList<String>();
		
		Alist2.add("A");
		Alist2.add("B");
		Alist2.add("C");
		Alist2.add("D");
		Alist2.add("E");
		System.out.println("===== Before Copy =====");
		System.out.println(Alist1+" "+Alist2);
		
		/*    First method or direct method 
		
          Collections.copy(Alist,Alist2);
	
	System.out.println("===== AFter Copy =====");
	System.out.println(Alist+" "+Alist2);   
	
	 */
		
		
		// second model to copy data list to list.
		
		for(String k : Alist1)
		{
			     Alist2.add(k);
		}
		
		System.out.println("===== AFter Copy =====");
		System.out.println(Alist1+" "+Alist2);   
		
	
	}

}
