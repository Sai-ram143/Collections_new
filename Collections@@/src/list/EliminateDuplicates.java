package list;

import java.util.ArrayList;
import java.util.HashSet;

public class EliminateDuplicates 
{

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> ob=new ArrayList<Integer>();
		
		ob.add(20);
		ob.add(20);
		ob.add(20);
		ob.add(30);
		ob.add(500);
		ob.add(30);
		
		System.out.println("DuplicateList:"+ob);
	
		HashSet<Integer> ob1=new HashSet<Integer>(ob);
		
	    ArrayList<Integer> ob2=new ArrayList<Integer>(ob1);
	
	    System.out.println("WithoutDuplicates:"+ob2);
	
	}

}
