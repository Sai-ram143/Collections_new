package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> ob= new HashMap<Integer,String>();
		
		ob.put(1, "A");
		ob.put(2, "B");
		ob.put(3, "C");
		ob.put(4, "D");
		ob.put(5, "E");
		
		for(Map.Entry x : ob.entrySet())
		{
			System.out.println(x.getKey()+" "+ x.getValue());
		}

		
		System.out.println("size of the map:"+ob.size());
		
		HashMap<Integer,String> ob1= new HashMap<Integer,String>();
		
	ob1.putAll(ob);
	
	   System.out.println(ob1); 
	   

	      if(ob.containsKey(1))
	      {
	    	  System.out.println("yes "+" " +ob.get(1));
	      }
	      
	      if(ob.containsValue("A"))
	      {
	    	  System.out.println("yes"+ob.get("A"));
	      }
	      
	     
	}

}
