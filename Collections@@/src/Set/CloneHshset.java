package Set;

import java.util.HashSet;

public class CloneHshset 
 {

	public static void main(String[] args) 
	{
		
		HashSet<String>ob=new HashSet<String>();
		
		ob.add("A");
		ob.add("B");
		ob.add("C");
		ob.add("D");
		ob.add("E");
		ob.add("F");
		ob.add("G");
		System.out.println("Before cloning:"+ob);
		
			HashSet<String> ob1=(HashSet) ob.clone();
			
			System.out.println("After Cloning:"+ob1);


		
			
			

	}

}
