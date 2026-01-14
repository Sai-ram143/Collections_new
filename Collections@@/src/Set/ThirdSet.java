package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ThirdSet 
{

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		HashSet<String> ob=new HashSet<String>();
		
			ob.add(new String("sai"));
			ob.add(new String("seetha"));
			ob.add(new String("iop"));
			ob.add(new String("Mohan"));
			ob.add(new String("as"));
			ob.add(new String("Tharak"));
			
			System.out.println("Before Removal:"+ob);
			Iterator<String> it=ob.iterator();
			
			while(it.hasNext())
			{
				String str=it.next();
				
			    char ch=str.charAt(0);
					if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')|| (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
					{
						it.remove();
			     	}
			}
			System.out.println("====== Removing the strings if started with vowel=======");
	System.out.println("After Removal:"+ob);
	}

}
