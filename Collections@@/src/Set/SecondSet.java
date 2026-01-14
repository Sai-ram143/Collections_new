package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SecondSet 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		HashSet<Integer> ob=new HashSet<Integer>();
		
		
		System.out.println("Enter the size of the values:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		 ob.add(new Integer(s.nextInt()));	
		}
		System.out.println(ob);
		
		
		Iterator<Integer> it= ob.iterator();
		
		it.forEachRemaining(x->System.out.println(x));
		
	
		while(it.hasNext())
		{
			int ele=it.next();
			
			int count=0;
		      for(int i=1;i<=ele;i++)
		      {
		    	  if(ele % i==0)
		    	  {
		    		  count++;
		    	  }
		      }
		      
		      if(count != 2)
		      {
		    	  it.remove();
		      }
			
		}
		System.out.println("Final set:"+ob);
		 
	}

}
