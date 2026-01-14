package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FirstList 
{

	public static void main(String[] args)
	{
	List<Integer> ob=new ArrayList<Integer>();
		
		ob.add(50);
		ob.add(60);
		ob.add(50);
		ob.add(60);
		ob.add(50);
		ob.add(60);
		
		//List Accepts Duplicate VALUES+
		
		System.out.println(ob);
		ob.set(0, 100);
		ob.add(0, 90);
		System.out.println("==== Insert Based On INDEX ====");
		System.out.println(ob);
		
		ob.set(2, 67);
		System.out.println("==== Replace Based On INDEX ====");
		System.out.println(ob);
		
		int i1=ob.indexOf(67);
		int i2=ob.lastIndexOf(60);
		System.out.println("Index of 67: "+i1);
		System.out.println("Last Index of 60: "+i2);
		
		List<Integer> ob1=ob.subList(1,4);
		

		System.out.println("==== SubList from 1-3 ====");
		System.out.println(ob1);
		
		int i3=ob.get(3);
		System.out.println("Get the Value:"+i3);
		
                 
		
		ListIterator <Integer> li= ob.listIterator();
		
		System.out.println("Fetching List Objects in Forward Direction");
		while(li.hasNext())
		{
			int ele=li.next();
  
				System.out.print(ele+" ");
				
		}
	
		  System.out.println("\n Fetching List Objects in Backward Direction");
		  
		while(li.hasPrevious())
		{
			int ele=li.previous();

				System.out.print(ele+" ");
		}
		
		System.out.println();
        ListIterator <Integer> li2= ob.listIterator(3);
		
        System.out.println(ob);
		System.out.println("===== Fetching List Objects in Forward Direction Based On Index ====");
		while(li2.hasNext())
		{
			int ele=li2.next();
  
				System.out.print(ele+" ");
				
		}
		System.out.println();
		
		System.out.println("===== Fetching List Objects in Backward Direction BASED on INDEX ====="); 
		while(li2.hasPrevious())
		{
			int ele=li2.previous();

				System.out.print(ele+" ");
		}
		
		
	}
	

}
