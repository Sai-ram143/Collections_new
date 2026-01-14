package list;

import java.util.ArrayList;

public class CloneList {

	public static void main(String[] args)
	{
		ArrayList<Integer> ob=new ArrayList<Integer>();
		
		ob.add(11);
		ob.add(12);
		ob.add(13);
		ob.add(14);
		ob.add(15);
	
	System.out.println("Original ArrayList:"+ob);
	
	ArrayList<Integer>newc1= (ArrayList) ob.clone();
	
	System.out.println("Cloned ArrayList:"+newc1);
	
	newc1.removeAll(newc1);
	
	System.out.println("After Removed List:"+newc1);
	
	boolean b=newc1.isEmpty();
	
	System.out.println("newc1 is empty: "+b);
	
	
	newc1.ensureCapacity(7);
	
	newc1.add(20);
	newc1.add(30);
	
	System.out.println("After Increasing the size");
	System.out.println(newc1);
	
	
	}

}
