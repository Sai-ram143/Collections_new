package Set;

import java.util.HashSet;
import java.util.TreeSet;


public class ConvertHashSetINTOArray
{

	public static void main(String[] args) 
	{
	            HashSet<Integer> ob=new HashSet<Integer>();
	            
	            ob.add(89);
	            ob.add(67);
	            ob.add(23);
	            ob.add(17);
	            ob.add(78);
	            
	       int size=ob.size();
	            //creating an array
		
	          Integer   array[]= new Integer[ob.size()];

	        //  int[] a=new int[size];
	          
	            ob.toArray(array);
	            
	            System.out.print("Array elements :");
	            for(int k : array)
	            {
	            
	            	System.out.print(k+" ");
	            }
	            
	            System.out.println("\n HashSet ob:"+ob);
	            
	            
	            //Creating TreeSet
	            TreeSet<Integer> ob2=new TreeSet<Integer>(ob);
	            
	            System.out.println("Converting HashSet to TreeSet :"+ob2);
	}

}
