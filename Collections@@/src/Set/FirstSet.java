package Set;

import java.util.HashSet;
import java.util.Scanner;

public class FirstSet 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in); 
		
		HashSet<Integer> ob1=new HashSet<Integer>();
		HashSet<Integer> ob2=new HashSet<Integer>();
		HashSet<Integer> ob3=new HashSet<Integer>();
	
		
		ob1.add(40);
		ob1.add(50);
		ob1.add(60);
		ob1.add(90);
		ob1.add(100);
		
		System.out.println("ob1 :"+ob1);
	
		System.out.println("Enter values of Ob2 :");
		ob2.add(new Integer(s.nextInt()));
		ob2.add(new Integer(s.nextInt()));
		ob2.add(new Integer(s.nextInt()));
		ob2.add(new Integer(s.nextInt()));
		ob2.add(new Integer(s.nextInt()));
				System.out.println(ob2);
	
		ob3.add(70);
		ob3.add(90);
		
		ob2.addAll(ob3);
		System.out.println("After adding :"+ob2);
		boolean b=ob1.contains(40);
		System.out.println("40 avilable in ob1:"+b);
		
		
		
		boolean b2=ob2.containsAll(ob3);
		System.out.println("ob3 avilable in ob2:"+b2);
		
		ob1.retainAll(ob3);
		System.out.println(ob1);
		System.out.println(ob3);
		
		 
	}

}
