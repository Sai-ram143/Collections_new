package list;

import java.util.ArrayList;
import java.util.*;
public class SecondList
{

	public static void main(String[] args) 
	{
		
		ArrayList<Float> ob=new ArrayList<Float>();
		
		ob.add(new Float(700));
		ob.add(new Float(900));
		ob.add(new Float(100));
		ob.add(new Float(600));
		ob.add(new Float(800));
		
		System.out.println(ob);
		
		
	/*	ob.replaceAll(x->
		{
			return x+(0.4F*x);
		}); */
		
		ob.replaceAll(x->x+(0.4F*x));
	System.out.println(ob);
	}
	
}
