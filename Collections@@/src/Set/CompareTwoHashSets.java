package Set;

import java.util.HashSet;

public class CompareTwoHashSets 
{

	public static void main(String[] args)
	{
		
		HashSet<Integer> ob1=new HashSet<Integer>();
		
	       
		ob1.add(11);
		ob1.add(12);
		ob1.add(143);
		ob1.add(103);
		ob1.add(24);
		ob1.add(193);
		
		HashSet<Integer> ob2=new HashSet<Integer>();
		ob2.add(10);
		ob2.add(12);
		ob2.add(143);
		ob2.add(18);
		ob2.add(19);
		ob2.add(11);
		
		for(int ele:ob1)
		{
			 boolean b= ob2.contains(ele);
			 System.out.println(ele+" is there in ob2 --"+b);
		}
		
		ob1.retainAll(ob2);
		
		System.out.println("Retained Content:"+ob1);
		
		ob1.clear();
		System.out.println("Clear All elements:"+ob1);
	}

}
