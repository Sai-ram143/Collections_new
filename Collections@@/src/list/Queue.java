package list;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) 
	{
		
		PriorityQueue<Integer> ob=new PriorityQueue();
		
		ob.add(5000);
		ob.add(9000);
		ob.add(1000);
		ob.add(2000);
		
		System.out.println("Adding:"+ob);
		ob.offer(4000);
			System.out.println(ob);
		ob.remove();
		System.out.println("Deleting:"+ob);

		
		System.out.println(ob.element());

	}

}
