package Set;

import java.util.HashSet;
import java.util.Scanner;

public class one {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
			HashSet<Integer> ob=new HashSet<Integer>();
			
			System.out.println("Enter the value");
			for(int i=0;i<=5;i++)
			{
			
			   ob.add(new Integer(s.nextInt()));
		
			}
			
			System.out.println(ob);
			
	}

}
