package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap 
{

	public static void main(String[] args) 
	{
 
		HashMap<Integer,String> ob=new HashMap<Integer,String>();
		
		ob.put(1, "SAI");
		ob.put(2, "SEETHA");
		ob.put(2, "RAM");
		ob.put(4, "MOHAN");
		ob.put(5, "BURADA");
		
		System.out.println(ob);

		String s1=ob.get(1);
		System.out.println(s1);
		
		
		Set <Integer> keyset=ob.keySet();
		
		System.out.println("set of keys:"+keyset);
		
		ob.values();
		System.out.println("set of values:"+ob.values());
		
		for(Map.Entry k : ob.entrySet())
		{
			System.out.println("key value =========  "+k.getKey()+"\n"+"Values ____"+k.getValue());
		}
		
		HashMap<Integer,String> clone=(HashMap) ob.clone();
		
		System.out.println("After cloning :"+clone);
		
		if(ob.containsKey(1))
		{
			System.out.println("yes:"+ob.get(1));
		}
		
		else
		{
			System.out.println("No");
		}
		
		}

}
