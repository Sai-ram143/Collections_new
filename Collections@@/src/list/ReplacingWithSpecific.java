package list;

import java.util.ArrayList;

public class ReplacingWithSpecific
{

	public static void main(String[] args)
	{
		ArrayList<String> ob=new ArrayList<String>();
		
		ob.add("Tiger");
		ob.add("Lion");
		ob.add("Dinosaur");
		
		
		System.out.println(ob);
		
		ob.set(1, "Elephant");
		
	int size=	ob.size();
	
	System.out.println("Size="+size);
	  for(int i=0;i<=size-1;i++)
	    {
		System.out.print(ob.get(i)+" ");
	    }
	  
	  for(String k : ob) 
	  {
		  System.out.print(k+ " ");
		  
	  }
	}
}
