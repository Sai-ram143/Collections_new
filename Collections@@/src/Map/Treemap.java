package Map;
import java.util.*;

public class Treemap {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> ob1=new TreeMap<Integer,String>();
		
		ob1.put(2,"c3");
		ob1.put(1,"c1");
		ob1.put(3,"c4");
		ob1.put(4,"c2");
		ob1.put(5,"c5");
		System.out.println(ob1);
		TreeMap<Integer,String> ob2=new TreeMap<Integer,String>();
		ob2.put(6,"A1");
		ob2.put(7,"A2");
		ob2.put(8,"A3");
		ob2.put(9,"A4");
		ob2.put(10,"A5");
		
		System.out.println(ob2);
		
		ob1.putAll(ob2);
		
		System.out.println("ob2 copied to ob1:"+ob1);
		
		
		if(ob1.containsKey(9))
			{
			System.out.println("It is there :"+ob1.get(9));
			}
		
		else
		{
			System.out.println("Not There");
		}
		
		Set<Integer> ob=ob1.keySet();
		
	
		for(int a: ob)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		System.out.println("Using Iterator");
		Iterator<Integer> it=ob.iterator();
		
		while(it.hasNext())
		{
		int ele=	it.next();
		System.out.print(ele+" ");
		}
        
	System.out.println("\n Greatest key:"+ob1.firstEntry());
	System.out.println("least key:"+ob1.lastEntry());
	
	System.out.println("\n Greatest key:"+ob1.firstKey());
	System.out.println("least key:"+ob1.lastKey());
	
	Set set=ob1.descendingKeySet();
	System.out.println("Reverse order keys:"+set);
			}
          
	
}
